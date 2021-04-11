package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

interface ApiTest {
    @Test default void shouldRunApi() {
        Api api = Api.load();

        var result = api.foo();

        assertEquals("okay", result);
    }
}
