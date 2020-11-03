/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.generics;

/**
 *
 * @author pep
 */
public class GenericsMain {

    public static void main(String[] args) {
        /**
         * Caja caja1 = new Caja(" Una cadena"); Caja caja2 = new Caja(1);
         * String content = (String) caja2.getContent();
         * System.out.println(content);
         */
        CajaGenerica<String> caja1 = new CajaGenerica<>("Contenido generico");
        CajaGenerica<Integer> caja2 = new CajaGenerica<>(2);

        Integer content = caja2.getContent();
        System.out.println(content);

    }

}
