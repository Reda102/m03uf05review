/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review.generics.collections.exercci;

import java.util.List;

/**
 *
 * @author pep
 */
public interface Matcher {
    
    Persona matches(Persona persona, List<Persona> candidatos);
    
}
