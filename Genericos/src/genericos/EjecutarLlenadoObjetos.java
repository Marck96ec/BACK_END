/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author clavi
 */
public class EjecutarLlenadoObjetos {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList coleccion = new ArrayList( 4);
//        coleccion.agregarElemento(new Empleado("Byron","Guamani","2581443"));
//        coleccion.agregarElemento("Maria");
//        coleccion.agregarElemento("Pepe");
        coleccion.agregarElemento("Julio");
        coleccion.agregarElemento("Daniel");
       coleccion.agregarElemento("Byron");
        
//        Empleado valor = (String) coleccion.obtenerElemento(2);
        String valor = (String)coleccion.obtenerElemento( 2);
        System.out.println(valor);
    }
    
}
