package com.valen.Herencia;

public class Coche extends Vehiculo{
    private int cilindrado;
    public Coche(String Marca, String modelo, int anio, int cilindrado) {
        super(Marca, modelo, anio);
        this.cilindrado = cilindrado;
    }
    public int getCilindrado(){
        return this.cilindrado;
    }
    public void setCilindrado(int cilindrado){
        this.cilindrado = cilindrado;
    }
    @Override
    public  void acelerar(){
        System.out.println("El vehiculo esta acelerando");
        //frenar();
       // System.out.println("mi cilindrada es : " + getCilindrado());
    }

    //public void frenar(){
       // System.out.println("El cohce esta frenando");
    //}
}
