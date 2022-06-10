/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2;

/**
 *
 * @author clavi
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    
   
    static void modificador_default()
    {
        System.out.println("Default");
    }
    
    private static void modificador_privado() {
        System.out.println("Privado");
    }
    
    protected static void modificador_protegido(){
        System.out.println("Protegido");
    }
    
    public static void modificador_publico(){
        System.out.println("publico");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        modificador_default();
        modificador_privado();
        modificador_protegido();
        modificador_publico();
    }
    
}
