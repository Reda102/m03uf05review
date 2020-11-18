/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.ejemplocalculadora;

/**
 *
 * @author Reda
 */
public class CalculadoraDeFracciones {

    private Fraccion operador1;
    private Fraccion operador2;

    public CalculadoraDeFracciones(Fraccion operador1, Fraccion operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    // a/b + c/d =((ad)+(bc)) / (bd)
    public Fraccion suma() {
        return new Fraccion(operador1.getNumerador() * operador2.getDenominador() + operador1.getDenominador() + operador2.getNumerador(),
                operador1.getDenominador() * operador2.getDenominador());
    }

    public Fraccion resta() {
        return new Fraccion(operador1.getNumerador() * operador2.getDenominador() - operador1.getDenominador() + operador2.getNumerador(),
                operador1.getDenominador() * operador2.getDenominador());
    }

    /**
     * producto de dos fracciones operador1 * operador2
     */
    public Fraccion multiplicacion() {
        return new Fraccion(operador1.getNumerador() * operador2.getNumerador(), operador1.getDenominador() * operador2.getDenominador());

    }

    /**
     * division de dos fracciones operador1 / operador2
     *
     */
    public Fraccion division() {
        return new Fraccion(operador1.getNumerador() * operador2.getDenominador(), operador2.getNumerador() * operador1.getDenominador());

    }

    /**
     * Maximo comun divisor, el numero mas grande que divide dos numeros
     *
     * por ejemplo mcd(12, 9) = 3 Fraccion(12, 9) -> Fraccion(4, 3)
     *
     * @param d1
     * @param d2
     * @return
     */
    private double mcd(double d1, double d2) {

        while (d1 != d2) {
            if (d1 > d2) {
                d1 = d1 - d2;
            } else {
                d2 = d2 - d1;
            }
        }

        return d1;

    }

    private Fraccion simplify(Fraccion fraccion) {
        double mcd = mcd(fraccion.getNumerador(), fraccion.getDenominador());
        return new Fraccion(fraccion.getNumerador() / mcd, fraccion.getDenominador() / mcd);
    }
}
