package br.xksoberbado.exceptionhandlerexample.exception;

public class BusinessException extends AbstractException {

    private static final String CODE = "BUSINESS";

    public BusinessException(final String message) {
        this(message, CODE);
    }

    public BusinessException(final String message, final String code) {
        super(message, code);
    }
}
