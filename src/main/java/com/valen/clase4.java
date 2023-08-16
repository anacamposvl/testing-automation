package com.valen;

import java.util.ArrayList;
import java.util.List;

public class clase4 {

    public static void main(String[] args){

    Estudiante pepe = new Estudiante();
    pepe.redirExamen("programacion java");
    pepe.setNombre("pepe");
    System.out.println(" el nombre del destudiante es: " + pepe.getNombre());

    System.out.println(pepe.getApellido());

    Estudiante cesar = new Estudiante("cesar", "mejia",1234);
    System.out.println("El nombre del estudiante es : " + cesar.getNombre());
    System.out.println("El apellido del estudiante es: " + cesar.getApellido());

    Estudiante jose = new Estudiante();
    System.out.println("el nombre del estudiante es: " + jose.getNombre());

    List<String> listaDeString = new ArrayList<>();
    listaDeString.add("holasis");
    listaDeString.add("chaooo");
    listaDeString.add(1,"pepe");
    }
}