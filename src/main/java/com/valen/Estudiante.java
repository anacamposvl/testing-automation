package com.valen;

public class Estudiante {

    String nombre ;
    String apellito;
    int legajo;
    boolean estaMatriculado;

    void redirExamen(String materia) {
        System.out.println("rendi el examen:" + materia );
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}
