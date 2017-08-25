package com.fred.exception;

/**
 * Date: 26.08.2017.
 * Time: 0:26.
 *
 * @author Pavel Gavrilov.
 */
public class ErrorMessageException extends Exception {
    public ErrorMessageException() {
        super();
    }

    public ErrorMessageException(String message) {
        super(message);
    }

    public ErrorMessageException(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorMessageException(Throwable cause) {
        super(cause);
    }

    protected ErrorMessageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
