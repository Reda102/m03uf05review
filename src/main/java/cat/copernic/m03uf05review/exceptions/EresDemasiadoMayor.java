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
public class EresDemasiadoMayor extends Exception {

    /**
     * Creates a new instance of <code>LaPalabraDemasiadoLargaException</code>
     * without detail message.
     */
    public EresDemasiadoMayor() {
    }

    /**
     * Constructs an instance of <code>LaPalabraDemasiadoLargaException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public EresDemasiadoMayor(String msg) {
        super(msg);
    }

    public EresDemasiadoMayor(String message, Throwable cause) {
        super(message, cause);
    }

    public EresDemasiadoMayor(Throwable cause) {
        super(cause);
    }

    public EresDemasiadoMayor(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
