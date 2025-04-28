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
                case 2 -> System.out.println("martes");
                case 3 -> System.out.println("miercoles");
                case 4 -> System.out.println("jueves");
                case 5 -> System.out.println("viernes");
                case 6 -> System.out.println("sabado");
                case 7 -> System.out.println("domingo");
                default -> System.out.println("Número de dia invalido");
        }

    }
}
