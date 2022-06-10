/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg1;

/**
 *
 * @author clavijo
 */
public class Calculadora {
    private double cantidad_uno = 1;
    private double cantidad_dos = 2;
    private double resultado;
    
    public void setCantidad_uno(double valor)
    {
        cantidad_uno = valor;
    }
    
    public void setCantidad_dos(double valor)
    {
        cantidad_dos = valor;
    }

    public double getSuma()
    {
        resultado = cantidad_uno + cantidad_dos;
        return resultado;
    }
    
    public double getResta()
    {
        resultado = cantidad_uno - cantidad_dos;
        return resultado;
    }
    
    public double getMultiplicacion()
    {
        resultado = cantidad_uno * cantidad_dos;
        return resultado;
    }
    
    public double getDivicion()
    {
        
        try {
            resultado = cantidad_uno / cantidad_dos;
        }
        catch (ArithmeticException e) {
            // Exception handler
            System.out.println(
                "Dividir para cero no es posible");
        }
        return resultado;
    }
    
}
