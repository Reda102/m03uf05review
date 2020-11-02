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
public class NoPuedesTenerComasExcepcion extends EresDemasiadoMayor {

    /**
     * Creates a new instance of
     * <code>NoPuedesDejarEspaciosEnBlancoException</code> without detail
     * message.
     */
    public NoPuedesTenerComasExcepcion() {
    }

    /**
     * Constructs an instance of
     * <code>NoPuedesDejarEspaciosEnBlancoException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NoPuedesTenerComasExcepcion(String msg) {
        super(msg);
    }

    public NoPuedesTenerComasExcepcion(String message, Throwable cause) {
        super(message, cause);
    }

    public NoPuedesTenerComasExcepcion(Throwable cause) {
        super(cause);
    }

    public NoPuedesTenerComasExcepcion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
