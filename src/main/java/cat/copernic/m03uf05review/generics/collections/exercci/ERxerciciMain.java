/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.generics.collections.exercci;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pep
 */
public class ERxerciciMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MatcherImpl match = new MatcherImpl();

        Persona prson = new Persona(10, Sexo.HOMBRE, 23, true, OrientacionSexual.HETERO, Formacion.GRADO_SUPERIOR, OrientacionPolitica.IZQUIERDA);
        List<Persona> listMatcher = new ArrayList<>();
        listMatcher.add(new Persona(01, Sexo.HOMBRE, 44, true, OrientacionSexual.HETERO, Formacion.GRADO, OrientacionPolitica.IZQUIERDA));
        listMatcher.add(new Persona(02, Sexo.HOMBRE, 19, false, OrientacionSexual.HETERO, Formacion.DOCTORADO, OrientacionPolitica.IZQUIERDA));
        listMatcher.add(new Persona(03, Sexo.HOMBRE, 59, false, OrientacionSexual.GAY, Formacion.GRADO_MEDIA, OrientacionPolitica.IZQUIERDA));
        listMatcher.add(new Persona(04, Sexo.MUJER, 22, true, OrientacionSexual.HETERO, Formacion.GRADO, OrientacionPolitica.IZQUIERDA));
        listMatcher.add(new Persona(05, Sexo.MUJER, 26, true, OrientacionSexual.HETERO, Formacion.GRADO_SUPERIOR, OrientacionPolitica.CENTRO));
        listMatcher.add(new Persona(06, Sexo.MUJER, 65, false, OrientacionSexual.BISEXUAL, Formacion.CATEDRATICO, OrientacionPolitica.IZQUIERDA));

        Persona Maach = match.matches(prson, listMatcher);

        System.out.println(Maach);
    }

}
