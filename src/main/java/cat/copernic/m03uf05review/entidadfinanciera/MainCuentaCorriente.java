/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.entidadfinanciera;

/**
 *
 * @author Reda
 */
public class MainCuentaCorriente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Cuenta Corriente Gold
        CuentaCorriente cuentaGold = new CuentaCorrienteACreditoGold("Mohamed",50000.0);
        cuentaGold.abona(4000.50); 
        cuentaGold.ingresa(500.50);
        System.out.println("La Cuenta Gold "+cuentaGold + "\n");
        
        
        //Cuenta Corriente Platinum
        
        CuentaCorriente cuentaPlatino = new CuentaCorrienteACreditoPlatinum("Fernando ",8000.0);
        cuentaPlatino.abona(11500.50);
        System.out.println("La Cuenta Platinum "+cuentaPlatino + "\n");
        
        //Cuenta Corriente Debito
        
        CuentaCorriente cuentaDebito = new CuentaCorrienteADebito("Julio",3000.0);
        cuentaDebito.abona(6000.00);
        System.out.println("La Cuenta Debito "+cuentaDebito + "\n");
        
    }
    
}
