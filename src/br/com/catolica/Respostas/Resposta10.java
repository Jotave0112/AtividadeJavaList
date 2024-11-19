package br.com.catolica.Respostas;

import java.util.HashMap;
import java.util.TreeMap;

public class Resposta10 {
    public static void main(String[] args) {


        TreeMap<String,Integer> nomesIdade = new TreeMap<>();

        nomesIdade.put("Reginaldo",48);
        nomesIdade.put("Luzia",70);
        nomesIdade.put("Julia",19);

        System.out.println(nomesIdade);
    }

}
