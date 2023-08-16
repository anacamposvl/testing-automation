package com.valen;

abstract class Animal {
    protected String nombre;
    private String tipo;
    public  String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    protected void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void haceAlgo() {
        System.out.println("grrr");
    }
    public String getTipo(){
        return this.tipo;
    }

    public void hacerRuido() {
        System.out.println("maullandooo");
    }
    abstract public void caminar();
}
