/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3entornos;

/**
 *
 * @author david_llopis
 */
import java.util.Scanner;
public class Main {
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
}
// ... aquí van las opciones 2, 3 y 4
}
} catch (NumberFormatException e) {
System.out.println("Entrada no válida");
}
}
}
}