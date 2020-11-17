/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.entidadfinanciera;

import java.security.InvalidParameterException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Reda
 */
public class CuentaCorrienteADebito extends CuentaCorritenteImpl {

    public CuentaCorrienteADebito(String titular, double saldo) {
        super(titular, saldo);
    }

    /**
     * 
     * Solamente se da un abono si hay saldo, si no se lanza una exception
     * 
     * @param abono 
     */
    @Override
    public void abona(double abono) {
        if (abono >= getSaldo()) {
            try {
                throw new Exception("No Tienes suficiente Saldo! " + getSaldo(), new InvalidParameterException());
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteADebito.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            setSaldo(getSaldo() - abono);
        }
    }
    
}
