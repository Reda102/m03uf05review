/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.generics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Reda
 *
 * Queremos que estudiante ha de ser comparable
 *
 * Estudiante ha de poderse ordenar por nota
 *
 */
public class Estudiante implements  Comparable<Estudiante> {

    private String nombre;
    private double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.nota) ^ (Double.doubleToLongBits(this.nota) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        if (Double.doubleToLongBits(this.nota) != Double.doubleToLongBits(other.nota)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }

    @Override
    public int compareTo(Estudiante estudiante) { //quitamos el throw añadimos el estudiante y comparamos por el nombre
        return nombre.compareTo(estudiante.nombre);
    }

     static class EstudianteComparadoNota implements Comparator<Estudiante> {

        @Override
        public int compare(Estudiante o1, Estudiante o2) {
            if (o1.getNota() < o2.getNota()) {
                return -1;
            } else if (o1.getNota() == o2.getNota()) {
                return 0;
            } else {
                return 1;
            }
        }

    }

    public static void main(String[] args) {
        List<Estudiante> listaEstudiante = new ArrayList();

        listaEstudiante.add(new Estudiante("Moha", 8.2));
        listaEstudiante.add(new Estudiante("Manolo", 5.6));
        listaEstudiante.add(new Estudiante("Andres", 4.5));
        listaEstudiante.add(new Estudiante("Sebastian", 7.6));
        listaEstudiante.add(new Estudiante("Zorro", 10.0));

        
        Collections.sort(listaEstudiante);
        System.out.println( "Ordenado por nombre: "+listaEstudiante);
        
        Collections.sort(listaEstudiante, new EstudianteComparadoNota());
        System.out.println(listaEstudiante);
        
    }

}
