package br.com.catolica.Respostas;

import java.util.HashMap;

public class Resposta09 {
    public static void main(String[] args) {

        HashMap<String,Integer> nomesIdade = new HashMap<>();

        nomesIdade.put("Julia",19);
        nomesIdade.put("Luzia",70);
        nomesIdade.put("Reginaldo",48);

        System.out.println(nomesIdade.get("Julia"));

    }

    }
