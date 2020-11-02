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
public class NoPuedesInsertarCaracteresExtrañosException extends EresDemasiadoMayor {

    /**
     * Creates a new instance of
     * <code>NoPuedesInsertarCaracteresExtrañosException</code> without detail
     * message.
     */
    public NoPuedesInsertarCaracteresExtrañosException() {
    }

    /**
     * Constructs an instance of
     * <code>NoPuedesInsertarCaracteresExtrañosException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NoPuedesInsertarCaracteresExtrañosException(String msg) {
        super(msg);
    }

    public NoPuedesInsertarCaracteresExtrañosException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoPuedesInsertarCaracteresExtrañosException(Throwable cause) {
        super(cause);
    }

    public NoPuedesInsertarCaracteresExtrañosException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
