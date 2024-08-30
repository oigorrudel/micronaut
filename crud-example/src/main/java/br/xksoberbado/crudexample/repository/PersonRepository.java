package br.xksoberbado.crudexample.repository;

import br.xksoberbado.crudexample.model.Person;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.PageableRepository;

import java.util.UUID;

@Repository
public interface PersonRepository extends PageableRepository<Person, UUID> {
}
