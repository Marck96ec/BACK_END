/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg3;

/**
 *
 * @author clavi
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo tri=new Triangulo();
        tri.setLado_1(2);
        tri.setLado_2(3);
        tri.setLado_3(2);
        
        int area = tri.getLado_1() + tri.getLado_2() + tri.getLado_3();
        tri.setArea(area);
        
        System.out.println("IEl area  del triangulo  : " + tri.getArea());
        
        Circulo ci=new Circulo();
        ci.setRadio(6);
        int area_c = ci.getRadio()*(3)*2;
        ci.setArea(area_c);
        
         
         System.out.println("IEl area del circulo es : " + ci.getArea());
    }
    
}
