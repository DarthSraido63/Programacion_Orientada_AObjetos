package edu.pedroortega.Reto1.Process;

/**
 * @author Pedro Ortega
 *
 * Esta clase contiene la lógica de las operaciones aritmeticas básicas
 * suma, resta, multiplicación, división, y módulo.
 * */
public class Calculator {
    /**
     *
     * @param num1 primer operando de la suma
     * @param num2 segundo operando de la suma
     * @return resultado de la suma de num1 y num2
     *
     * Este método sirve para sumar dos números enteros
     */
    public static int sumaEnteros(int num1,int num2){
        return num1 + num2;
    }

    /**
     *
     * @param num1 primer operando de la resta
     * @param num2 segundo operando de la resta
     * @return resultado de la resta de num1 y num2
     *
     * Este método sirve para restar dos números enteros
     */
    public static int restaEnteros(int num1,int num2){
        return num1 - num2;
    }

    /**
     *
     * @param num1 primer operando de la división
     * @param num2 segundo operando de la división
     * @return resultado de la división de dos números enteros
     *
     * Este método sirve para dividir dos números enteros
     */
    public static int divideEnteros(int num1,int num2){
        return num1 / num2;
    }

    /**
     *
     * @param num1 primer operando de la multiplicación
     * @param num2 segundo operando de la multiplicación
     * @return resultado de la multiplicación de dos números enteros
     *
     * Este método sirve para multiplicar dos números enteros
     */
    public static int multiplicaEnteros(int num1,int num2){
        return num1 * num2;
    }

    /**
     *
     * @param num1 primer operando de modulo
     * @param num2 segundo operando de modulo
     * @return resultado del modulo de dos números enteros
     *
     *Este método sirve para sacar el modulo de dos números enteros
     */
    public static int moduloEnteros(int num1,int num2){
        return num1 % num2;
    }
}
