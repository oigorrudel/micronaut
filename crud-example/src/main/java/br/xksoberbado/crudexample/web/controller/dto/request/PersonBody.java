package br.xksoberbado.crudexample.web.controller.dto.request;

import br.xksoberbado.crudexample.model.Gender;
import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record PersonBody(String name, Gender gender){
}
