package br.com.catolica.Respostas;

import java.util.HashMap;

public class Resposta20 {
    public static void main(String[] args) {

        HashMap<Integer,String> dias =  new HashMap<>();

        dias.put(1,"Domingo");
        dias.put(2,"Segunda");
        dias.put(3,"Terca");
        dias.put(4,"Quarta");
        dias.put(5,"Quinta");

        dias.put(3, "Quarta");

        System.out.println(dias);

        }

    }
