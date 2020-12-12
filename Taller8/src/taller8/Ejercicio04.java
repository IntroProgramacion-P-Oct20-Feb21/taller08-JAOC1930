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
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        double operacion;
        double total=0;
        System.out.println("Ingresar el límite de la operación");
        x = entrada.nextInt();
        if (x >= 0){
         for (int i = 0; i <= x; i++) {
            operacion = Math.pow(-1,i)/(2*i + 1);
            total = total + operacion;
         }
         
        }else{
            System.out.println("El valor ingresado es negativo");
        }
        System.out.printf("%.2f", total);

    }
    
}
