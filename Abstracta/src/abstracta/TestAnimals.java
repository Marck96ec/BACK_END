/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracta;

import java.util.ArrayList;

/**
 *
 * @author clavi
 */
public class TestAnimals {
    public static void main(String[] args) {
        Pollo piolin = new Pollo();
//        piolin.expresarse();
        
        Gallina rick = new Gallina();
//        rick.expresarse();
        
        Vaca elsa = new Vaca();
//        elsa.expresarse();
        
        ArrayList <Animal> animals = new ArrayList <Animal>();
        animals.add(elsa);
        animals.add(rick);
        animals.add(piolin);
        
        for(Animal animal:animals){
            animal.expresarse();
        }
        
    }
}
