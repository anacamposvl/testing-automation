package com.valen.ejercicioCalculadora;

import java.util.Scanner;

public class Calculadora {
    public void calculadoraPoo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("----------");
        System.out.println("Ingrese el primer numero");

        double num1 = scanner.nextDouble();

        System.out.println("Ingrese segundo numero");

        double num2 = scanner.nextDouble();

        System.out.println("Ingrese la operacion (+, -, *, /,)");
         char operacion = scanner.next().charAt(0);

        double resultado = 0;

        switch (operacion){
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("No se puede hacer la operacion");
        }
        System.out.println("El resultado de la operacion es:");
        System.out.println(resultado);
    }
}