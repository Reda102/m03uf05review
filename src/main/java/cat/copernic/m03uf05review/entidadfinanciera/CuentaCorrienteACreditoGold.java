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
public class CuentaCorrienteACreditoGold extends CuentaCorrienteACredito {

    public CuentaCorrienteACreditoGold(String titular, double saldo) {
        super(titular, saldo);
    }
    /**
     * Esta cuenta permite una descubierto de hasta 3000 €, si es más
     * lanza una exception
     * 
     * @param abono 
     */
    @Override
    public void abona(double abono) {
       
       if (abono >= getSaldo() + 3000.0) {
            try {
                throw new Exception("Esta cuenta solo  permite un descubierto de hasta 3000 euros: " + abono , new InvalidParameterException());
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorrienteACreditoGold.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            setSaldo(getSaldo() - abono);
        }
    }

   

    
}
