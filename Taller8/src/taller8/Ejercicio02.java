/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller8;

/**
 *
 * @author Usuario
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        char valor;
            for (int j = 1; j <= 26; j++) {
                valor = (char)(j+96);
                for (int i = 0 ; i < j; i++) {
                   System.out.printf("%s", valor);
            }
                System.out.println("");
            }
    }
}
