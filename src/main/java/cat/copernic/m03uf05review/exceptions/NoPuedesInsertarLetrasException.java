/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.exceptions;

/**
 *
 * @author Reda
 */
public class NoPuedesInsertarLetrasException extends EresDemasiadoMayor {

    /**
     * Creates a new instance of <code>NoPuedesInsertarNumerosException</code>
     * without detail message.
     */
    public NoPuedesInsertarLetrasException() {
    }

    /**
     * Constructs an instance of <code>NoPuedesInsertarNumerosException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public NoPuedesInsertarLetrasException(String msg) {
        super(msg);
    }

    public NoPuedesInsertarLetrasException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoPuedesInsertarLetrasException(Throwable cause) {
        super(cause);
    }

    public NoPuedesInsertarLetrasException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
