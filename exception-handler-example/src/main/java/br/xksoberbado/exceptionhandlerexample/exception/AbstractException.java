package br.xksoberbado.exceptionhandlerexample.exception;

public abstract class AbstractException extends RuntimeException {

    protected String code;
    protected String message;

    private AbstractException() {
    }

    protected AbstractException(final String message, final String code) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
