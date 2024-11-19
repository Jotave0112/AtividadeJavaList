package br.com.catolica.Respostas;

import java.util.ArrayList;

public class Resposta03 {
    public static void main(String[] args) {

//        "maçã", "banana", "laranja", "abacaxi"


        ArrayList<String> frutas =  new ArrayList<>();
        int posicao = 0;
        frutas.add("maca");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");

        for(int x = 0; x < frutas.size(); x++){

            if(frutas.get(x).equals("banana")){
                System.out.printf("Fruta encontrada na posicao: %d\n", posicao);
            }
            else{
                System.out.println("Nao eh esse");
                posicao++;
            }
        }

    }
}
