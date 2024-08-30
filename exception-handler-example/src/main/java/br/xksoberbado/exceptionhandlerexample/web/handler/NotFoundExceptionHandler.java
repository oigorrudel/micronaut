package br.xksoberbado.exceptionhandlerexample.web.handler;

import br.xksoberbado.exceptionhandlerexample.exception.NotFoundException;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import io.micronaut.http.server.exceptions.response.ErrorContext;
import io.micronaut.http.server.exceptions.response.ErrorResponseProcessor;
import jakarta.inject.Singleton;

@Produces
@Singleton
public class NotFoundExceptionHandler implements ExceptionHandler<NotFoundException, HttpResponse> {

    private final ErrorResponseProcessor<?> errorResponseProcessor;

    public NotFoundExceptionHandler(final ErrorResponseProcessor<?> errorResponseProcessor) {
        this.errorResponseProcessor = errorResponseProcessor;
    }

    @Override
    public HttpResponse handle(final HttpRequest request,
                               final NotFoundException exception) {
        return errorResponseProcessor.processResponse(
            ErrorContext.builder(request)
                .cause(exception)
                .errorMessage(exception.getMessage())
                .build(),
            HttpResponse.notFound()
        );
    }
}
