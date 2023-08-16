package com.valen;

public class Perro extends Animal{
    public Perro(String nombre, String tipo){
        this.nombre = nombre;
        setTipo(tipo);
        hacerRuido();;
    }
    @Override
    public void hacerRuido(){
        System.out.println("ladrandoooo");
    }

    @Override
    public void caminar() {
        System.out.println("camino como un perro");
    }
    @Override
    public String toString(){
        return "me llamo " + this.nombre + " y soy de tipo " + this.getTipo();}
}
