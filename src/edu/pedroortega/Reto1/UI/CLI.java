package edu.pedroortega.Reto1.UI;

import edu.pedroortega.Reto1.Process.Calculator;

import java.util.Scanner;

public class CLI {
    /**
     * hace una conección con "Calculator" para poder desplegar un menú de 6 opciones con las
     * operaciones aritmeticas básicas: suma, resta, multiplicación, división, y módulo.
     */
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una operación");
        System.out.println("1, suma");
        System.out.println("2, resta");
        System.out.println("3, división");
        System.out.println("4, multiplicación");
        System.out.println("5, modulo");
        int opcionMenu = scanner.nextInt();

        /**
         * Después de desplegar el menu y elegir la operación deseada, hace un print para que
         * puedas elegir los dos enteros a calcular.
         */
        System.out.println("Introduce dato 1");
        int num1 = scanner.nextInt();
        System.out.println("Introduce dato 2");
        int num2 = scanner.nextInt();

        switch(opcionMenu){

            /**
             * Una vez elegidos los dos enteros realiza una suma
             */
            case 1:
                System.out.println(num1 + "+"+num2+"="+ Calculator.sumaEnteros(num1,num2));
                break;

            /**
             * Una vez elegidos los dos enteros realiza una resta
             */
            case 2:
                System.out.println(num1 + "-"+num2+"="+ Calculator.restaEnteros(num1,num2));
                break;

            /**
             * Una vez elegidos los dos enteros realiza una división
             */
            case 3:
                System.out.println(num1 + "/"+num2+"="+ Calculator.divideEnteros(num1,num2));
                break;

            /**
             * Una vez elegidos los dos enteros realiza una miltiplicación
             */
            case 4:
                System.out.println(num1 + "*"+num2+"="+ Calculator.multiplicaEnteros(num1,num2));
                break;

            /**
             * Una vez elegidos los dos enteros realiza un módulo
             */
            case 5:
                System.out.println(num1 + "%"+num2+"="+ Calculator.moduloEnteros(num1,num2));
                break;

        }
    }
}
