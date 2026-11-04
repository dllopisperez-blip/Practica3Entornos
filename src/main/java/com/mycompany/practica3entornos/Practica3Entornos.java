/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3entornos;

import java.util.Scanner;

public class Practica3Entornos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 5) {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            
            try {
                opcion = Integer.parseInt(sc.nextLine());
                
                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Primer número: ");
                    int a = Integer.parseInt(sc.nextLine());
                    System.out.print("Segundo número: ");
                    int b = Integer.parseInt(sc.nextLine());
                    
                    if (opcion == 1) {
                        System.out.println("Resultado: " + (a + b));
                    } else if (opcion == 2) {
                        System.out.println("Resultado: " + (a - b));
                    } else if (opcion == 3) {
                        System.out.println("Resultado: " + (a * b));
                    } else if (opcion == 4) {
                        // Control de errores específico para la división entre cero
                        if (b == 0) {
                            System.out.println("Error: No se puede dividir entre cero.");
                        } else {
                            double resultado = (double) a / b;
                            System.out.println("Resultado: " + resultado);
                        }
                    }
                } else if (opcion == 5) {
                    System.out.println("Saliendo del programa...");
                } else {
                    System.out.println("Opción no válida. Debe ser entre 1 y 5.");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida");
            }
        }
        sc.close();
    }
}