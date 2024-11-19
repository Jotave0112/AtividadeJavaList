package br.com.catolica.Respostas;

import java.util.ArrayList;

public class Resposta02 {
    public static void main(String[] args) {

        ArrayList<Integer> inteiros  = new ArrayList<>();

        for(int x = 10; x < 51; x = x + 10){
            inteiros.add(x);
        }
        inteiros.remove(2);
        System.out.println(inteiros);
    }
}
