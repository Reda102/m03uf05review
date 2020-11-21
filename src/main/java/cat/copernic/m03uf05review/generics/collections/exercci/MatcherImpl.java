/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.generics.collections.exercci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author pep
 */
public class MatcherImpl implements Matcher {

    private double match(Formacion persona, Formacion candidato) {
        double match = 0.0;

        switch (persona) {
            case PRIMARIA:
                switch (candidato) {
                    case PRIMARIA:
                        match = 1.0;
                        break;
                    case SECUNDARIA:
                        match = 0.9;
                        break;
                    case GRADO_MEDIO:
                        match = 0.8;
                        break;
                    case BACHILLERATO:
                        match = 0.7;
                        break;
                    case GRADO_SUPERIOR:
                        match = 0.6;
                        break;
                    case GRADO:
                        match = 0.5;
                        break;
                    case DOCTORADO:
                        match = 0.4;
                        break;
                    case CATEDRATICO:
                        match = 0.3;
                        break;
                }
                break;
            case SECUNDARIA:
                switch (candidato) {
                    case PRIMARIA:
                        match = 0.3;
                        break;
                    case SECUNDARIA:
                        match = 1.0;
                        break;
                    case GRADO_MEDIO:
                        match = 0.9;
                        break;
                    case BACHILLERATO:
                        match = 0.8;
                        break;
                    case GRADO_SUPERIOR:
                        match = 0.7;
                        break;
                    case GRADO:
                        match = 0.6;
                        break;
                    case DOCTORADO:
                        match = 0.5;
                        break;
                    case CATEDRATICO:
                        match = 0.4;
                        break;
                }
                break;
            case GRADO_MEDIO:
                switch (candidato) {
                    case PRIMARIA:
                        break;
                    case SECUNDARIA:
                        break;
                    case GRADO_MEDIO:
                        break;
                    case BACHILLERATO:
                        break;
                    case GRADO_SUPERIOR:
                        break;
                    case GRADO:
                        break;
                    case DOCTORADO:
                        break;
                    case CATEDRATICO:
                        break;
                }
                break;
            case BACHILLERATO:
                switch (candidato) {
                    case PRIMARIA:
                        break;
                    case SECUNDARIA:
                        break;
                    case GRADO_MEDIO:
                        break;
                    case BACHILLERATO:
                        break;
                    case GRADO_SUPERIOR:
                        break;
                    case GRADO:
                        break;
                    case DOCTORADO:
                        break;
                    case CATEDRATICO:
                        break;
                }
                break;
            case GRADO_SUPERIOR:
                switch (candidato) {
                    case PRIMARIA:
                        break;
                    case SECUNDARIA:
                        break;
                    case GRADO_MEDIO:
                        break;
                    case BACHILLERATO:
                        break;
                    case GRADO_SUPERIOR:
                        break;
                    case GRADO:
                        break;
                    case DOCTORADO:
                        break;
                    case CATEDRATICO:
                        break;
                }
                break;
            case GRADO:
                switch (candidato) {
                    case PRIMARIA:
                        break;
                    case SECUNDARIA:
                        break;
                    case GRADO_MEDIO:
                        break;
                    case BACHILLERATO:
                        break;
                    case GRADO_SUPERIOR:
                        break;
                    case GRADO:
                        break;
                    case DOCTORADO:
                        break;
                    case CATEDRATICO:
                        break;
                }
                break;
            case DOCTORADO:
                switch (candidato) {
                    case PRIMARIA:
                        break;
                    case SECUNDARIA:
                        break;
                    case GRADO_MEDIO:
                        break;
                    case BACHILLERATO:
                        break;
                    case GRADO_SUPERIOR:
                        break;
                    case GRADO:
                        break;
                    case DOCTORADO:
                        break;
                    case CATEDRATICO:
                        break;
                }
                break;
            case CATEDRATICO:
                switch (candidato) {
                    case PRIMARIA:
                        break;
                    case SECUNDARIA:
                        break;
                    case GRADO_MEDIO:
                        break;
                    case BACHILLERATO:
                        break;
                    case GRADO_SUPERIOR:
                        break;
                    case GRADO:
                        break;
                    case DOCTORADO:
                        break;
                    case CATEDRATICO:
                        break;
                }
                break;
        }
        return match;
    }

    private double match(OrientacionPolitica persona, OrientacionPolitica candidato) {
        switch (persona) {
            case EZXTREMA_DERECHA:
                break;
            case DERECHA:
                break;
            case CENTRO:
                break;
            case IZQUIERDA:
                break;
            case EXTREMA_IZQUIERDA:
                break;
        }
        return 0.0;
    }

    private double match(OrientacionSexual persona, OrientacionSexual candidato) {
        switch (persona) {
            case BISEXUAL:
                break;
            case GAY:
                break;
            case HETERO:
                break;
            case LESBIANA:
                break;
        }
        return 0.0;
    }

    /**
     *
     * @param persona
     * @param candidat
     * @return un double entre 0 y n donde 0 es un no match y n un match pleno
     */
    private Match match(Persona persona, Persona candidato) {
        double match = match(persona.getFormacion(), candidato.getFormacion());
        match += match(persona.getOrientacionPolitica(), candidato.getOrientacionPolitica());
        match += match(persona.getOrientacionSexual(), candidato.getOrientacionSexual());
        return new Match(persona, candidato, match);
    }

    @Override
    public Persona matches(Persona persona, List<Persona> candidatos) {
        List<Match> matches = new ArrayList<>();
        for (Iterator<Persona> it = candidatos.iterator(); it.hasNext();) {
            matches.add(match(persona, it.next()));
        }
        Collections.sort(matches);
        return matches.get(matches.size() - 1).getCandidato();
    }

}
