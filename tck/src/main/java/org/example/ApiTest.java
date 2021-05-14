package org.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApiTest {
    Api api = Api.load();

    @Test void shouldRunApi() {
        var result = api.foo();

        assertEquals("okay", result);
    }

    @Test void shouldRunApiAgain() {
        var result = api.foo();

        assertEquals("okay", result);
    }

    @Nested class NestedTest {
        @Test void shouldRunApiNested() {
            var result = api.foo();

            assertEquals("okay", result);
        }

        @Test void shouldRunApiNestedAgain() {
            var result = api.foo();

            assertEquals("okay", result);
        }
    }
}
