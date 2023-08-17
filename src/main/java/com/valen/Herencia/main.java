package com.valen.Herencia;

public class main {
    public static void main(String[] args) {

        Vehiculo toyota = new Vehiculo("Toyota", "Corolla", 2020);

        Coche ford = new Coche("Ford", "Mustang", 2021,5000);

        System.out.println("marca: " + toyota.getmarca());
        System.out.println("Modelo: " + toyota.getModelo());
        System.out.println("anio: " + toyota.getAnio());

        toyota.acelerar();
        toyota.frenar();

        System.out.println("marca" + ford.getmarca());
        System.out.println("modelo"+ ford.getModelo());
        System.out.println("anio" + ford.getAnio());
        System.out.println("cilindrado"+ ford.getCilindrado());
        ford.acelerar();
        ford.frenar();
    }
}