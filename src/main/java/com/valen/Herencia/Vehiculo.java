package com.valen.Herencia;

public class Vehiculo {
    private String marca;
    private String modelo;
    private  int anio;
    public Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public Vehiculo(){

    }
    public String getmarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getAnio(){
        return this.anio;
    }
    public void acelerar(){
        System.out.println("Estoy acelerando");
    }
    public void frenar(){
        System.out.println("Estoy frenando");
    }
}
