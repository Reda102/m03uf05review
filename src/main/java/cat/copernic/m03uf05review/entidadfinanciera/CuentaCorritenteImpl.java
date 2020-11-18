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
public abstract class CuentaCorritenteImpl implements CuentaCorriente {
    
    private String titular;
    private double saldo;

    public CuentaCorritenteImpl(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaCorritenteImpl [" + "EL Titular es: " + titular + ", con un saldo de: " + saldo + ']';
    }

    @Override // Excepciones de la interficie Ingresa y Abona para evitar meter  "0".
    public void ingresa(double ingreso) {
        if (ingreso <= 0) {
            try {
                throw new Exception("Ingreso negativo: " + ingreso, new InvalidParameterException());
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorritenteImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        saldo = saldo + ingreso;
    }

    @Override 
    public void abona(double abono) {
        if (abono <= 0) {
            try {
                throw new Exception("Abono negativo: " + abono, new InvalidParameterException());
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorritenteImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
        saldo =  saldo - abono;
    }  
    

    
}