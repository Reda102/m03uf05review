/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.generics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Reda
 */
public class GenericMain {

    /**
     * Escribe un método que retorne el ultimo elemento de una lista
     */
    public static <T> T ultimo(List<T> lista1) {

        return (T) lista1.get(lista1.size() - 1);

    }

    /**
     * Escribe una método que retorne la media de una lista de Double
     */
    public static double media(List<Double> lista2) {
        double media = 0.0;
        for (int i = 0; i < lista2.size(); i++) {
            media = media + lista2.get(i);
        }
       
        return media;
    }

    /**
     * Escribe un método que retorne la cadena mas larga de una lista de String
     */
    public static String largoLista(List<String> lista1) {
        String mayor = lista1.get(0);
        for (int i = 0; i < lista1.size(); i++) {
            if (lista1.get(i).length() > mayor.length()) {
                mayor = lista1.get(i);
            }
        }
        
        return mayor;
    }

    /**
     * Escribe un método que retorne el maximo de una lista de enteros
     */
    public static int maxLista(List<Integer> lista3) {
        Integer maxi = lista3.get(0);
        for (int i = 0; i < lista3.size(); i++) {
            if (lista3.get(i) > maxi) {
                maxi = lista3.get(i);
            }
        }
        
        return maxi;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<String> lista1 = new ArrayList<String>();

        lista1.add("Holaa!!!");
        lista1.add("Reda!");
        lista1.add("Xavi!");
        lista1.add("Fernando!");
        lista1.add("Antonio!");
        lista1.add("Santiago!");

        if (lista1.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            System.out.println("Lista tiene " + lista1.size() + " elements.");
        }

        lista1.remove("Reda!");

        for (int i = 0; i < lista1.size(); i++) {
            System.out.println("La lista contiene " + lista1.get(i));
        }

        List<Double> lista2 = new ArrayList<Double>();
        lista2.add(1.5);
        lista2.add(2.5);
        lista2.add(3.5);

        List<Integer> lista3 = new ArrayList<Integer>();
        lista3.add(1);
        lista3.add(2);
        lista3.add(3);

        //Pruebas
        System.out.println("El ultimo elemento del arraylist es: " + ultimo(lista1));

        System.out.println("La media del ArrayList es: " + media(lista2));

        System.out.println("La cadena mas larga del ArrayList es:  " + largoLista(lista1));

        System.out.println("El numero mas largo del ArrayList es: " + maxLista(lista3));

        /**
         * for (ListIterator<String> it = lista1.listIterator(lista1.size() ;
         * it.hasPrevious();) { String t = it.previous(); }
         */ // aqui hay que leer la lista de manera Iterator
    }

}
