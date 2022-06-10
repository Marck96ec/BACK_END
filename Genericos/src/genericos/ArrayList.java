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
public class ArrayList <T>{
    
    private Object[] conjunto;
    private int i;

    public ArrayList(int tamanio) {
        conjunto = (T[])new Object[tamanio];
    }
    
    
    
    public void agregarElemento(Object object){
        conjunto[i] = object;
        i++;
    }
    
    public Object obtenerElemento(int posicion){
        return conjunto[posicion];
    }
    
    
}
