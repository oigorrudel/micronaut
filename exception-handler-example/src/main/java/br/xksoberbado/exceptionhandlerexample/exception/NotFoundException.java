package br.xksoberbado.exceptionhandlerexample.exception;

public class NotFoundException extends AbstractException {

    private static final String CODE = "NOT_FOUND";

    public NotFoundException(final String message) {
        this(message, CODE);
    }

    protected NotFoundException(final String message, final String code) {
        super(message, code);
    }
}
