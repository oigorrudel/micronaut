package br.xksoberbado.interceptorexample.web.filter;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.RequestFilter;
import io.micronaut.http.annotation.ResponseFilter;
import io.micronaut.http.annotation.ServerFilter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ServerFilter("/**")
public class CustomFilter {

    @RequestFilter
    public void pre(final HttpRequest request) {
        log.info("Pre!");
    }

    @ResponseFilter
    public void pos(final HttpResponse response) {
        log.info("Pos!");
    }
}
