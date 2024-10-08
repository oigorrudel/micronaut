package br.xksoberbado.exceptionhandlerexample.web.handler;

import br.xksoberbado.exceptionhandlerexample.exception.BusinessException;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import io.micronaut.http.server.exceptions.response.ErrorContext;
import io.micronaut.http.server.exceptions.response.ErrorResponseProcessor;
import jakarta.inject.Singleton;

@Produces
@Singleton
public class BusinessExceptionHandler implements ExceptionHandler<BusinessException, HttpResponse> {

    private final ErrorResponseProcessor<?> errorResponseProcessor;

    public BusinessExceptionHandler(final ErrorResponseProcessor<?> errorResponseProcessor) {
        this.errorResponseProcessor = errorResponseProcessor;
    }

    @Override
    public HttpResponse handle(final HttpRequest request,
                               final BusinessException exception) {
        return errorResponseProcessor.processResponse(
            ErrorContext.builder(request)
                .cause(exception)
                .errorMessage(exception.getMessage())
                .build(),
            HttpResponse.unprocessableEntity()
        );
    }
}
