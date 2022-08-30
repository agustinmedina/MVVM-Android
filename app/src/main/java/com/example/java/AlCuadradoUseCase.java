package com.example.java;

public class AlCuadradoUseCase {
    public static String alCuadrado(String data){
        if(data.equals("")){
            return "Campo vacio";
        }
        return String.valueOf(Double.valueOf(data)*Double.valueOf(data));
    }
}
