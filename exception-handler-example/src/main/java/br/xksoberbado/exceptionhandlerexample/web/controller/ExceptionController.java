package br.xksoberbado.exceptionhandlerexample.web.controller;

import br.xksoberbado.exceptionhandlerexample.exception.BusinessException;
import br.xksoberbado.exceptionhandlerexample.exception.NotFoundException;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("v1/exceptions")
public class ExceptionController {

    @Get("not-found")
    public void notFound() {
        throw new NotFoundException("test.not.found");
    }

    @Get("business")
    public void business() {
        throw new BusinessException("CODE_EXAMPLE", "business.exception");
    }
}
