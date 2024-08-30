package br.xksoberbado.exceptionhandlerexample.web.handler;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.http.MediaType;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.server.exceptions.response.ErrorContext;
import io.micronaut.http.server.exceptions.response.ErrorResponseProcessor;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.inject.Singleton;

@Singleton
public class CustomErrorResponseProcessor implements ErrorResponseProcessor<CustomErrorResponseProcessor.MyJsonError> {

    @Override
    public @NonNull MutableHttpResponse<MyJsonError> processResponse(@NonNull final ErrorContext errorContext,
                                                                     @NonNull final MutableHttpResponse<?> response) {
        final var error = new MyJsonError();
        error.setPath(errorContext.getRequest().getPath());
        error.setMessage(errorContext.getErrors().get(0).getMessage());

        return response
            .body(error)
            .contentType(MediaType.APPLICATION_JSON_TYPE);
    }

    @Serdeable
    public static class MyJsonError {
        private String path;
        private String code;
        private String message;

        public String getPath() {
            return path;
        }

        public void setPath(final String path) {
            this.path = path;
        }

        public String getCode() {
            return code;
        }

        public void setCode(final String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(final String message) {
            this.message = message;
        }
    }
}
