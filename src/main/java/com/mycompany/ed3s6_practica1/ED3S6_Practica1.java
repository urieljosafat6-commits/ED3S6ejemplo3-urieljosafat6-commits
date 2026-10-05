/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ed3s6_practica1;

import java.util.Scanner;

public class ED3S6_Practica1<T,U> {

   T num1;
    U num2;

    public ED3S6_Practica1(T num1, U num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void detecta() {
        // --- 1. PROCESAMIENTO DE ENTEROS ---
        if (num1 instanceof Integer && num2 instanceof Integer) {
            int inum1 = (Integer) num1;
            int inum2 = (Integer) num2;

            Scanner teclado = new Scanner(System.in);
            menu();
            int opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("RESULTADO: " + num1 + " + " + num2 + " = " + (inum1 + inum2));
                    break;
                case 2:
                    System.out.println("RESULTADO: " + num1 + " - " + num2 + " = " + (inum1 - inum2));
                    break;
                case 3:
                    System.out.println("RESULTADO: " + num1 + " * " + num2 + " = " + (inum1 * inum2));
                    break;
                case 4:
                    if (inum2 != 0) {
                        System.out.println("RESULTADO: " + num1 + " / " + num2 + " = " + ((double) inum1 / inum2));
                    } else {
                        System.out.println("ERROR: No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        // --- 2. PROCESAMIENTO DE FLOATS ---
        } else if (num1 instanceof Float && num2 instanceof Float) {
            float fnum1 = (Float) num1;
            float fnum2 = (Float) num2;

            Scanner teclado = new Scanner(System.in);
            menu();
            int opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("RESULTADO: " + num1 + " + " + num2 + " = " + (fnum1 + fnum2));
                    break;
                case 2:
                    System.out.println("RESULTADO: " + num1 + " - " + num2 + " = " + (fnum1 - fnum2));
                    break;
                case 3:
                    System.out.println("RESULTADO: " + num1 + " * " + num2 + " = " + (fnum1 * fnum2));
                    break;
                case 4:
                    if (fnum2 != 0) {
                        System.out.println("RESULTADO: " + num1 + " / " + num2 + " = " + (fnum1 / fnum2));
                    } else {
                        System.out.println("ERROR: No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        // --- 3. PROCESAMIENTO DE DOUBLES ---
        } else if (num1 instanceof Double && num2 instanceof Double) {
            double dnum1 = (Double) num1;
            double dnum2 = (Double) num2;

            Scanner teclado = new Scanner(System.in);
            menu();
            int opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("RESULTADO: " + num1 + " + " + num2 + " = " + (dnum1 + dnum2));
                    break;
                case 2:
                    System.out.println("RESULTADO: " + num1 + " - " + num2 + " = " + (dnum1 - dnum2));
                    break;
                case 3:
                    System.out.println("RESULTADO: " + num1 + " * " + num2 + " = " + (dnum1 * dnum2));
                    break;
                case 4:
                    if (dnum2 != 0) {
                        System.out.println("RESULTADO: " + num1 + " / " + num2 + " = " + (dnum1 / dnum2));
                    } else {
                        System.out.println("ERROR: No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        // --- 4. PROCESAMIENTO DE CADENAS (STRING) ---
        } else if (num1 instanceof String && num2 instanceof String) {
            System.out.println("LA UNION DE 2 CADENAS ES: " + num1 + " " + num2);

        // --- 5. PROCESAMIENTO DE CARACTERES ---
        } else if (num1 instanceof Character && num2 instanceof Character) {
            System.out.println("LOS CARACTERES INGRESADOS SON: '" + num1 + "' Y '" + num2 + "'");
        }
    }

    private void menu() {
        System.out.println("\n--- MENU DE OPCIONES ---");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        System.out.print("QUE OPCION DESEAS: ");
    }

    public static void main(String[] args) {
        // Ejemplo con Enteros
        System.out.println("--- EJEMPLO CON ENTEROS ---");
        ED3S6_Practica1<Integer, Integer> obj1 = new ED3S6_Practica1<>(5, 3);
        obj1.detecta();

        // Ejemplo con Doubles
        System.out.println("\n--- EJEMPLO CON DOUBLES ---");
        ED3S6_Practica1<Double, Double> obj2 = new ED3S6_Practica1<>(5.5, 3.3);
        obj2.detecta();
 System.out.println("\n--- EJEMPLO CON FLOAT ---");
        ED3S6_Practica1<Float,Float> obj4 = new ED3S6_Practica1<>(5.5f,3.3f);
            obj4.detecta();
        // Ejemplo con Strings
        System.out.println("\n--- EJEMPLO CON STRINGS ---");
        ED3S6_Practica1<String, String> obj3 = new ED3S6_Practica1<>("hola", "mundo");
        obj3.detecta();
    }
}
