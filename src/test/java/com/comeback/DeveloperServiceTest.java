package com.comeback;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DeveloperServiceTest {
    @Test
    void shouldFindSeniorDevelopers() {

        var developers = List.of(
                new Developer("Alice", 8),
                new Developer("Bob", 3),
                new Developer("Amanda", 10)
        );

        var service = new DeveloperService();

        var result = service.findSeniorDeveloperNames(developers);

        assertEquals(
                List.of("Alice", "Amanda"),
                result
        );
    }

    @Test
    void shouldReturnEmptyListWhenNobodyIsSenior() {

        var developers = List.of(
                new Developer("Bob", 3),
                new Developer("John", 2)
        );

        var service = new DeveloperService();

        var result = service.findSeniorDeveloperNames(developers);

        assertEquals(List.of(), result);
    }

    @Test
    void shouldFindDevelopers() {

        var developers = List.of(
                new Developer("Alice", 8),
                new Developer("Bob", 3)
        );

        var result = DeveloperService.findDeveloper(developers, "Alice");

        assertEquals(
                developers.get(0),
                result
        );
    }

    @Test
    void shouldThrowIllegalArgumentExceptionFindDevelopers() {

        var developers = List.of(
                new Developer("Alice", 8),
                new Developer("Bob", 3)
        );


        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> DeveloperService.findDeveloper(developers, "Charlie")
        );

        assertEquals("Developer not found: Charlie", exception.getMessage());
    }

}
