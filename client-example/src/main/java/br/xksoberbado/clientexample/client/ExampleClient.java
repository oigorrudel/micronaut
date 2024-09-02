package br.xksoberbado.clientexample.client;

import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;

import java.util.List;

@Client("https://api.restful-api.dev/objects")
public interface ExampleClient {

    @Get("{id}")
    Object get(@PathVariable Long id);

    @Get
    List<Object> get();

    @Post
    Object post(@Body Object body);

    @Delete
    Object delete(Long id);
}
