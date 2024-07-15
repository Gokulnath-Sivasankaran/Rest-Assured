package com.restassured;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SampleTest {
    private Sample sample;

    @BeforeEach
    void setUp() {
        sample = new Sample();
    }

    @Test
    void getFirstName() {
        sample.setFirstName("Son");
        assertEquals("Son", sample.getFirstName());
    }

    @Test
    void getLastName() {
        sample.setLastName("Goku");
        assertEquals("Goku", sample.getLastName());
    }

    @Test
    void getFullName() {
        sample.setFirstName("Son");
        sample.setLastName("Goku");
        assertEquals("SON GOKU", sample.getFullName());
    }
}
