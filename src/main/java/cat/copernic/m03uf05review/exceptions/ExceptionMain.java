/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Reda
 *
 * Las exceptions derivadas de RuntimeException y la propia RuntimeException son
 * excepciones uncheked ( no necesitan try catch) El otro si
 */
public class ExceptionMain {

    /*
    static double division(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("denominador no puede ser 0", new IllegalArgumentException());
        }
        return a / b;
    }

    static String readFirstLineFromFile(String path) throws IOException {
        try (BufferedReader br
                = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    } */
    public static void main(String[] args) throws EresDemasiadoMayor {

        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa tu  Edad: ");
        int edad = in.nextInt();
        final int EdadMax = 100;
        try {
            if (edad < EdadMax) {
                System.out.println("Tu edad es " + edad);
            } else {
                throw new EresDemasiadoMayor("Edad no permitida, usted tiene que tener menos de 100 años !!!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /*  double d = 0;
        try {
            d = division(5, 0.0);
        } catch (Exception ex) {
            Logger.getLogger(ExceptionMain.class.getName()).log(Level.SEVERE, null, ex);
        } finally {   // es un bloke opcional que siempre se ejecuta
            System.out.println("Esto es Finally");
        }
     */
}
