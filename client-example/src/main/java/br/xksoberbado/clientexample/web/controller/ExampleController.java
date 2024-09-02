package br.xksoberbado.clientexample.web.controller;

import br.xksoberbado.clientexample.client.ExampleClient;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("v1/call")
public class ExampleController {

    @Inject
    private ExampleClient client;

    @Get("{id}")
    public Object get(@PathVariable final Long id) {
        return client.get(id);
    }

    @Get
    public List<Object> get() {
        return client.get();
    }

    @Post
    public Object post(@Body final Object body) {
        return client.post(body);
    }

    @Delete("{id}")
    public Object delete(@PathVariable final Long id) {
        return client.delete(id);
    }
}
