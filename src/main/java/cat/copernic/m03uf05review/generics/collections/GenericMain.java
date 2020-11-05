/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.generics.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Reda
 */
// Para ordenar mediante la Edad de una lista.
class AlumnoEdadComparator implements Comparator<Alumno> {

    @Override
    public int compare(Alumno o1, Alumno o2) {
        if (o1.getEdad() < o2.getEdad()) {
            return -1;
        } else if (o1.getEdad() == o2.getEdad()) {
            return 0;
        } else {
            return 1;
        }
    }

}

public class GenericMain {

    /**
     * Escribe un método que retorne el ultimo elemento de una lista
     */
    public static <T> T ultimo(List<T> lista1) throws Exception {  // correccion del Profe:
        if (lista1.isEmpty()) {
            throw new Exception("Lista vacia");
        }
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

        return media / lista2.size();
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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

//        // Como usar Map
//        Map<Integer, Alumno> mapa = new HashMap();
//
//        mapa.put(1, new Alumno("Pepe", 26));
//        mapa.put(1, new Alumno("Pepe", 26));
//        mapa.put(2, new Alumno("Reda", 10));
//        mapa.put(3, new Alumno("Sara", 34));
//
//        //Leer atraves de la clave
//        Set<Integer> claves = mapa.keySet();
//
//        for (Iterator it = claves.iterator(); it.hasNext();) {
//            System.out.println(mapa.get(it.next()));
//        }
//
//        // Metodo Value retorna el valor de una colleccion
//        Collection<Alumno> col = mapa.values();
//        for (Iterator it = col.iterator(); it.hasNext();) {
//            System.out.println(it.next());
//        }
//
////        /*
//        //leer de por Id 
//        Alumno alumno = mapa.get(3);
//        System.out.println(alumno); */
////        
//        // Usar sort para ordenar la lista y el compareTO
//        List<Alumno> listaalumno = new ArrayList();
//        
//        listaalumno.add(new Alumno("Moha", 10));
//        listaalumno.add(new Alumno("Manolo", 10));
//        listaalumno.add(new Alumno("Andres", 10));
//        listaalumno.add(new Alumno("Sebastian", 10));
//        listaalumno.add(new Alumno("Zorro", 10));
//        
//        Collections.sort(listaalumno);
//        System.out.println(listaalumno);
    }
}
//        Como usar un Set
//        Set<Alumno> set = new HashSet();
//        set.add(new Alumno("Pepe", 34));
//        set.add(new Alumno("Pepe", 34));
//        set.add(new Alumno("Juan", 12));
//        set.add(new Alumno("Luis", 34));
//         como leer un Iterator
//        for (Iterator it = set.iterator(); it.hasNext();) {
//            System.out.println(it.next());
//
/**
 * Como usar List List<String> lista1 = new ArrayList<String>();
 *
 * lista1.add("Holaa!!!"); lista1.add("Reda!"); lista1.add("Xavi!");
 * lista1.add("Fernando!"); lista1.add("Antonio!"); lista1.add("Santiago!");
 *
 * if (lista1.isEmpty()) { System.out.println("Lista vacia"); } else {
 * System.out.println("Lista tiene " + lista1.size() + " elements."); }
 *
 * lista1.remove("Reda!");
 *
 * for (int i = 0; i < lista1.size(); i++) { System.out.println("La lista
 * contiene " + lista1.get(i)); }
 *
 * List<Double> lista2 = new ArrayList<Double>(); lista2.add(1.5);
 * lista2.add(2.5); lista2.add(3.5);
 *
 * List<Integer> lista3 = new ArrayList<Integer>(); lista3.add(1);
 * lista3.add(2); lista3.add(3);
 *
 * //Pruebas System.out.println("El ultimo elemento del arraylist es: " +
 * ultimo(lista1));
 *
 * System.out.println("La media del ArrayList es: " + media(lista2));
 *
 * System.out.println("La cadena mas larga del ArrayList es: " +
 * largoLista(lista1));
 *
 * System.out.println("El numero mas largo del ArrayList es: " +
 * maxLista(lista3));
 */
/**
 * for (ListIterator<String> it = lista1.listIterator(lista1.size() ;
 * it.hasPrevious();) { String t = it.previous(); }
 */ // aqui hay que leer la lista de manera Iterator
// ejemplo

