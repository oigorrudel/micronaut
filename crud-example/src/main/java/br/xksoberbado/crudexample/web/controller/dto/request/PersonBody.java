package br.xksoberbado.crudexample.web.controller.dto.request;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record PersonBody(String name){
}
