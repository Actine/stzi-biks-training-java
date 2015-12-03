package com.uzhnu.training.lecture7;

/**
 * Code for lecture ${LECTURE_NUMBER}
 *
 * @author Paul Danyliuk
 * @date 16:29 @ 02.12.2015.
 */
public class BadEquationArgumentException extends RuntimeException {

    public BadEquationArgumentException() {
        super();
    }

    public BadEquationArgumentException(String s) {
        super(s);
    }

    public BadEquationArgumentException(Throwable cause) {
        super(cause);
    }

    public BadEquationArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}
