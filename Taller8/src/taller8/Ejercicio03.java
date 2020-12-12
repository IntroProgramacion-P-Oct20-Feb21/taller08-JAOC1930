/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller8;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        double operacion;
        double total=0;
        System.out.println("Ingresar el límite de la operación");
        x = entrada.nextInt();
        if (x >= 0){
         for (int i = 1; i <= x; i++) {
            operacion = 1 /(Math.pow(2,i));
            total = total + operacion;
         }
         
        }else{
            System.out.println("El valor ingresado no es positivo");
        }
        System.out.printf("%.2f", total);
    }
    
    
}
