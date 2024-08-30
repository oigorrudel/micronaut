package br.xksoberbado.exceptionhandlerexample.exception;

public class NotFoundException extends AbstractException {

    private static final String CODE = "NOT_FOUND";

    public NotFoundException(final String message) {
        this(CODE, message);
    }

    protected NotFoundException(final String code, final String message) {
        super(code, message);
    }
}
