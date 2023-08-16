package com.valen;

public class herencia {
    public static void main(String[] args){
        gato colo = new gato();
        Perro toby = new Perro("toby", "callejero");
        colo.hacerRuido();
        toby.hacerRuido();
        colo.caminar();
        toby.caminar();
        System.out.println(toby);
    }
}
