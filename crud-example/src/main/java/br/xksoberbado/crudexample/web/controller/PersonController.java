package br.xksoberbado.crudexample.web.controller;

import br.xksoberbado.crudexample.model.Person;
import br.xksoberbado.crudexample.service.PersonService;
import br.xksoberbado.crudexample.web.controller.dto.request.PersonBody;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.UUID;

@Controller("v1/persons")
public class PersonController {

    @Inject
    private PersonService service;

    @Get
    public Page<Person> get(final Pageable pageable) {
        return service.get(pageable);
    }

    @Post
    @Status(HttpStatus.CREATED)
    public Person post(@Body final PersonBody body) {
        return service.toCreate(body);
    }

    @Put("{id}")
    public Person put(@PathVariable final UUID id,
                      @Body final PersonBody body) {
        return service.toUpdate(id, body);
    }

    @Delete("{id}")
    @Status(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable final UUID id) {
        service.toDelete(id);
    }
}
