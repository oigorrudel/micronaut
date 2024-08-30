package br.xksoberbado.crudexample.web.controller.dto.request;

import br.xksoberbado.crudexample.model.Gender;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Serdeable
public record PersonBody(@NotEmpty String name, @NotNull Gender gender){
}
