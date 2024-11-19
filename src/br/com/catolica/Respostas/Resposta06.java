package br.com.catolica.Respostas;

import java.util.HashSet;

public class Resposta06 {
    public static void main(String[] args) {

        HashSet<String> city = new HashSet<>();

        city.add("Paragominas");
        city.add("Narnia");
        city.add("Tilambuco");
        city.add("Souza");
        city.add("CZ");

        for( String cidades: city){
            System.out.println(cidades);
        }
    }
}
