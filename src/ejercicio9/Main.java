/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author dark_
 */
public class Main {

   
    public static void main(String[] args) {
   Matematicas matematicas = new Matematicas();
        
        matematicas.setA(Math.random()*11);
        matematicas.setB(Math.random()*11);
        
        
        System.out.printf("El numero 1 es %f, el numero 2 es %f\n", matematicas.getA(), matematicas.getB());
        System.out.println("El mayor de los numeros es: ");
        matematicas.devolverMayor();
        matematicas.calcularPotencia();
        matematicas.calcularRaiz();
        
    }
    
}
