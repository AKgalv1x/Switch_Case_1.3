/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.switch_case_angiee;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Switch_Case_Angiee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menú Secreto, por favor ingresar el número de su elección (1-5): ");
        
        int dia = scanner.nextInt();
        
        switch (dia){
                case 1 -> System.out.println("Ramen de pollos y setas");
                case 2 -> System.out.println("Pancakes con miel y fresas");
                case 3 -> System.out.println("Bandeja Paisa");
                case 4 -> System.out.println("Arroz con leche");
                case 5 -> System.out.println("Empanadas");
                case 6 -> System.out.println("Galletas con leche");
                case 7 -> System.out.println("Arroz chino");
                default -> System.out.println("Número de dia invalido");
        }

    }
}
