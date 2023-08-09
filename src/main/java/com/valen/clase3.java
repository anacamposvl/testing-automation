package com.valen;

public class clase3 {
        public static void main(String[] args){
// Estructura de control

                int dato1 = 200;
                int dato2 = 30;

                if (dato1 < dato2) {

                        System.out.println("Dato 1 es mas chico que dato 2");

                        if (dato1 < 5) {
                                System.out.println("Dato 1 es muy muy chico");
                        }
                } else {
                        System.out.println("Dato 2 es mas grande que dato 1");
                }
                if (dato1 < dato2){
                        System.out.println("Dato 1 es mas chico que dato 2");
                } else if (dato1 == dato2) {
                        System.out.println("Dato 1 es mas chico que dato 2");
                }
                        System.out.println("------------------------");
                        String nombre = "pepe";
                        switch (nombre) {
                                case "carla":
                                        System.out.println("soy carla");
                                        break;
                                case "ramiro":
                                        System.out.println("soy ramiro");
                                        break;
                                case "pepe":
                                        System.out.println("soy pepe");
                                        break;
                                default:
                                        System.out.println("no estas en la lista");
                        }
                        if (nombre.equals("ramiro")){
                                System.out.println("soy valentina");
                        }
                        else if (nombre.equals("pepe")){
                                System.out.println("soy pepe");
                        }
                        else if (nombre.equals("ramiro")) {
                                System.out.println("soy ramiro");
                        }
                        else {
                        System.out.println("no estas en la lista");
        }
         int numero = 10;
                        while(numero <= 100) {
                                System.out.println("el numero es:" + numero);
                                numero = numero + 10;
                        }
                        System.out.println("------------------");
                        int numero2  = 10;
                        do {
                                System.out.println("el numero es: " + numero2);
                                numero2 = numero2 + 10;
                        }
                         while (numero2 < 100);

                         System.out.println("-----------------------");
                        // int numero3 = 10;

                         for (int i = 0; i < 100; i = i + 10){
                                 System.out.println("el numero es: "+ i);
                         }
        }
}


