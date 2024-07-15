package com.restassured.model;

import java.util.Arrays;

public interface DescriptionType {

    String getName();

    static <E extends Enum<?> & DescriptionType> E from(Class<E> enumType, String description) {
        return from(enumType, description, false);
    }

    static <E extends Enum<?> & DescriptionType> E from(Class<E> enumType, String description, boolean strictMode) {
        E decode = Arrays.stream(enumType.getEnumConstants())
                .filter(
                        d -> d.getName().equals(description)
                ).findFirst().orElse(null);

        if (decode == null && strictMode) {
            throw new IllegalArgumentException(String.format("Unable to decode into %s from description %s", enumType.getName(), description));
        } else {
            return decode;
        }
    }
}

