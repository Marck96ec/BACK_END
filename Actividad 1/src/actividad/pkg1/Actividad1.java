/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg1;

import actividad.pkg1.Calculadora;

/**
 *
 * @author clavijo
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora micalculadora = new Calculadora();
        
       micalculadora.setCantidad_uno(5);
       micalculadora.setCantidad_dos(2);
        
        System.out.println("El resultado de la suma es : " +  micalculadora.getSuma());
        System.out.println("El resultado de la resta es : " +  micalculadora.getResta());
        System.out.println("El resultado de la divición es : " +  micalculadora.getDivicion());
        System.out.println("El resultado de la multiplicación es : " +  micalculadora.getMultiplicacion());
    }
    
}
