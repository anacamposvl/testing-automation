package com.valen;

public class Estudiante {

    private String nombre ;

    private String apellido;
    private int legajo;
    private boolean estaMatriculado;

    public Estudiante(){
    this.nombre = "pepe";
    this.apellido = "mejia";
    this.legajo = 1234;
    }
    public Estudiante(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }


    void redirExamen(String materia) {
        System.out.println("rendi el examen:" + materia );
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    protected String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void rendirExamen(String materia){
        System.out.println("Rendi la materia" + materia);
    }
}
