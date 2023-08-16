package com.valen;

public class gato extends Animal{
    private int num1;
    private int num2;
    public void hacerAlgo(){
        System.out.println("holaaa");
    }
    public void hacerAlgo(String param1){
        System.out.println("holaaaa");
    }
    public void hacerAlgo(String param1, int param2) {
        System.out.println("holaaa");
    }
        @Override
        public void hacerRuido(){
            System.out.println("maullandooo");
        }
        @Override
                public void caminar(){
            System.out.println("estoy caminando como un gato");
        }
    }

