package br.xksoberbado.crudexample.service;

import br.xksoberbado.crudexample.model.Person;
import br.xksoberbado.crudexample.repository.PersonRepository;
import br.xksoberbado.crudexample.web.controller.dto.request.PersonBody;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.UUID;

@Singleton
public class PersonService {

    @Inject
    private PersonRepository repository;

    public Page<Person> get(final Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Person toCreate(final PersonBody body) {
        final var person = new Person();
        person.setName(body.name());
        person.setGender(body.gender());

        return repository.save(person);
    }

    public Person toUpdate(final UUID id,
                           final PersonBody body) {
        return repository.findById(id)
            .map(person -> {
                person.setName(body.name());
                person.setGender(body.gender());

                return repository.update(person);
            })
            .orElseThrow();
    }

    public void toDelete(final UUID id) {
        repository.deleteById(id);
    }
}
