package org.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Api2Test {
    Api api = Api.load();

    @Test void shouldRunApi2() {
        var result = api.foo();

        assertEquals("okay", result);
    }

    @Test void shouldRunApi2Again() {
        var result = api.foo();

        assertEquals("okay", result);
    }

    @Nested class Nested2Test {
        @Test void shouldRunApi2Nested() {
            var result = api.foo();

            assertEquals("okay", result);
        }

        @Test void shouldRunApi2NestedAgain() {
            var result = api.foo();

            assertEquals("okay", result);
        }
    }
}
