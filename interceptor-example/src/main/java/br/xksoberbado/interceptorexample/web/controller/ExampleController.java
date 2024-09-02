package br.xksoberbado.interceptorexample.web.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller("v1/hello")
public class ExampleController {

    @Get
    public String get() {
        log.info("Aqui :D");

        return "lol";
    }
}
