package br.com.catolica.Respostas;

import java.util.LinkedList;

public class Resposta14 {
    public static void main(String[] args) {


        LinkedList<Integer> numeros = new LinkedList<>();

        for (int x = 1; x < 6; x++) {
            numeros.add(x);
        }
        for (int x = 0; x < 5;x++){
            System.out.println(numeros);
            numeros.remove();
        }
    }
}
