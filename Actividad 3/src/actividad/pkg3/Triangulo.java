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
public class Triangulo extends Figura2D{
    
    private int lado_1;
    
    private int lado_2;
    
    private int lado_3;
    
    private int resultado;

    public int getLado_1() {
        return lado_1;
    }

    public void setLado_1(int lado_1) {
        this.lado_1 = lado_1;
    }

    public int getLado_2() {
        return lado_2;
    }

    public void setLado_2(int lado_2) {
        this.lado_2 = lado_2;
    }

    public int getLado_3() {
        return lado_3;
    }

    public void setLado_3(int lado_3) {
        this.lado_3 = lado_3;
    }
    
    public int area() {
        resultado = lado_1 + lado_2 + lado_3;
        return resultado;
    }

    
    
    
}
