package br.xksoberbado.exceptionhandlerexample.exception;

public class BusinessException extends AbstractException {

    private static final String CODE = "BUSINESS";

    public BusinessException(final String message) {
        this(CODE, message);
    }

    public BusinessException(final String code, final String message) {
        super(code, message);
    }
}
