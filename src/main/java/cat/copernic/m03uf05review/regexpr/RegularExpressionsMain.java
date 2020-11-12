/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.regexpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pep
 */
public class RegularExpressionsMain {


    /**
     * Expresión regular que valide NIE
     */
    static boolean validateNIF(String nif) {       
        Pattern p = Pattern.compile("\\d{8}\\p{Upper}"); // contendra 8 cifras + el patern mayuscula
        Matcher m = p.matcher(nif);

        return m.matches();

    }

    /**
     * Expresión regular que valide un telefono de movil
     */
    static boolean validateTLF(String tlf) {  // 3 cifras separadas por 3
        Pattern p = Pattern.compile("\\d{3}\\s\\d{3}\\s\\d{3}");
        Matcher m = p.matcher(tlf);

        return m.matches();

    }

    /**
     * Expresión regular que valide una matricula: 4 digitos espacio 3 letras
     * mayúscula sin vocales
     */
    static boolean validateMatriculaCoche(String matricula) { // 4 cifras + verificar la vocal del A-Z que tendra 3 espacios
        Pattern p = Pattern.compile("\\d{4}\\s[A-Z&&[^AEIOU]]{3}"); 
        Matcher m = p.matcher(matricula);

        return m.matches();

    }

    /**
     * Expresión regular que valide una fecha formato dd/mm/aaaa
     */
    static boolean validateFecha(String fecha) {// contendra 1 espacio + otro numero obligatorio del 1 al 9 + minimo 12 y otro numero obligatorio del 0 al 9
                                                            
        Pattern p = Pattern.compile("(0[1-9]|[12][0-9]|^3[01])\\/(0[1-9]|1[012])\\/[0-9]{4}");
        Matcher m = p.matcher(fecha);

        return m.matches();

    }

    /**
     * Expresión regular que valide un email
     */
    static boolean validateEmail(String email) { // contendra todos los caracteres + caracteres numericos del 0 al 9 + caracteres como . _ - aparte de la @ y todos los caracteres de nuevo.
        Pattern p = Pattern.compile("^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9-]+)$");
        Matcher m = p.matcher(email);

        return m.matches();

    }

    /**
     * @param args the command line arguments Regular expressions are a way to
     * describe a set of strings based on common characteristics shared by each
     * string in the set
     *
     * A Pattern object is a compiled representation of a regular expression
     *
     * A Matcher object is the engine that interprets the pattern and performs
     * match operations against an input string
     *
     * A PatternSyntaxException object is an unchecked exception that indicates
     * a syntax error in a regular expression pattern
     *
     */
    public static void main(String[] args) {
             
        
        System.out.println("Validamos el NIF:\n");
        
        String nif1 = "13454677A";
        String nif2 = "1345467A";
        String nif3 = "13454677A";
        String nif4 = "13454677323A";
        
        boolean validarNif1 = validateNIF(nif1);
        boolean validarNif2 = validateNIF(nif2);
        boolean validarNif3 = validateNIF(nif3);
        boolean validarNif4 = validateNIF(nif4);
        
        System.out.println(nif1 + ": " + validarNif1);
        System.out.println(nif2 + ": " + validarNif2);
        System.out.println(nif3 + ": " + validarNif3);
        System.out.println(nif4 + ": " + validarNif4+ "\n");
        
        
         System.out.println("Validar el numero Mobil (9 caracteres)\n");
        
        String tlf1 =   "123 456 7f89";
        String tlf2 =    "123 456 789";
        String tlf3 =   "123 456 78910";
        
        boolean validarTlf1 = validateTLF(tlf1);
        boolean validarTlf2 = validateTLF(tlf2);
        boolean validarTlf3 = validateTLF(tlf3);
        
        System.out.println(tlf2 + ": " + validarTlf2);
        System.out.println(tlf1 + ": " + validarTlf1);
        System.out.println(tlf3 + ": " + validarTlf3 + "\n");
        
        //Validar matricula del coche
        
        System.out.println("Validar matricula del coche:\n");
        
        String matri1 = "12345 ABC";
        String matri2 = "1234 ABC";
        String matri3 = "1234 ZGX";
        
        boolean validarMatricula1 = validateMatriculaCoche(matri1);
        boolean validarMatricula2 = validateMatriculaCoche(matri2);
        boolean validarMatricula3 = validateMatriculaCoche(matri3);
        
        System.out.println(matri1 + ": " + validarMatricula1);
        System.out.println(matri2 + ": " + validarMatricula2);
        System.out.println(matri3 + ": " + validarMatricula3 + "\n");
        
      //Validar formate de fecha
        
        System.out.println("Validar Fecha:\n");
        
        String fecha1 = "58/13/2005";
        String fecha2 = "8/11/2020"; //Esta fecha no esta formada correctamente le falta "0" delante del 8
        String fecha3 = "01/03/2110";
        
        boolean validarFecha1 = validateFecha(fecha1);
        boolean validarFecha2 = validateFecha(fecha2);
        boolean validarFecha3 = validateFecha(fecha3);
        
        System.out.println(fecha1 + ": " + validarFecha1);
        System.out.println(fecha2 + ": " + validarFecha2);
        System.out.println(fecha3 + ": " + validarFecha3 + "\n");
      
       //Validar correo
        
        System.out.println("Validar correo electronico:\n");
        
        String email1 = "reda@gmail.com";
        String email2 = "Moha@@gmail.com"; 
        String email3 = "Moha.reda@gmail.com";
        
        boolean validarEmail1 = validateEmail(email1);
        boolean validarEmail2 = validateEmail(email2);
        boolean validarEmail3 = validateEmail(email3);
        

        System.out.println(email1 + ": " + validarEmail1);
        System.out.println(email2 + ": " + validarEmail2);
        System.out.println(email3 + ": " + validarEmail3 + "\n");
    }
}
