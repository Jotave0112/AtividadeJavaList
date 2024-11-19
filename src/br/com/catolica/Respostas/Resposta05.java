package br.com.catolica.Respostas;

import java.util.ArrayList;
import java.util.HashSet;

public class Resposta05 {
    public static void main(String[] args) {

        HashSet<Integer> inteiros  = new HashSet<>();

        for(int x = 10; x < 51; x = x + 10){
            inteiros.add(x);
        }
        inteiros.add(30);
        System.out.println(inteiros);
    }

}
