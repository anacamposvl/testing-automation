package com.valen;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*/ Declaracion e instanciacion
        int edad = 26; // Declarando la variable edad de tipo int
        char fecha;
        edad = 18; // Inicializando la variable edad con valor 18
        char tipo_documento = 'D'; // Declarar e inicializar una variable

        // Tipos primitivos
        byte var1 = 5;
        short var2 = 100;
        int var3 = 10000;
        long var4 = 10000000000000000L;

        float var5 = 10.12f;
        double var6 = 10.222222222222222222222222222;

        char var7 = 't';

        boolean var8 = true;
        boolean var9 = false;

        String var10 = "Hola";

        int valor1 = 10;
        int valor2 = 20;

        int suma = valor1 + valor2;
        System.out.println(suma);

        System.out.println(var1 + var3);
        System.out.println(var5 + var6);
        System.out.println(var3 + var5);
        */
        // Colecciones
        int[] arrayDeInt = new int[3];

        arrayDeInt[0] = 10;
        arrayDeInt[1] = 20;
        arrayDeInt[2] = 30;
        arrayDeInt[3] = 40;

        System.out.println("El array tiene: " + Arrays.toString(arrayDeInt));

        List<Integer> listaDeInt = new ArrayList<>();
        listaDeInt.add(10);
        listaDeInt.add(20);
        listaDeInt.add(30);

        /// Estructura de control
        int dato1 = 20;
        int dato2 = 30;

        if (dato1 < dato2) {
            System.out.println("dato es mas chico que dato 2");

            if (dato1 < 5) {
                System.out.println("dato1 es muy chico");
            }
        } else {
            System.out.println("dato 2 es mas grande que dato 1");
        }
        if (dato1 < dato2) {
            System.out.println("dato 1 es mas chico que dato 2");
        } else if (dato1 != dato2) {
            System.out.println("dato 1 es igual a dato 2");
        } else if (dato1 > dato2) {
            System.out.println("dato 1 es igual a dato 2");
        }
        else {
            System.out.println("dato 2 es mas grande que dato 1");
        }
    }
}