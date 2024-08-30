package br.xksoberbado.lombokexample.web.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Controller("v1/persons")
public class ExampleController {

    @Get
    public List<Person> get() {
        return List.of(
            Person.of(UUID.randomUUID(), "Joao"),
            Person.of(UUID.randomUUID(), "Maria")
        );
    }

    @Data
    @AllArgsConstructor(staticName = "of")
    @Serdeable
    public static class Person {
        private UUID id;
        private String name;
    }
}
