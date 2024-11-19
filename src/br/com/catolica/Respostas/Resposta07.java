package br.com.catolica.Respostas;

import java.util.HashSet;

public class Resposta07 {
    public static void main(String[] args) {

        HashSet<Integer> inteiros =  new HashSet<>();

        for(int x = 0; x < 26; x +=5) {
            inteiros.add(x);
        }
            if(inteiros.contains(15)){
                System.out.println(inteiros);
                System.out.println("Tem!");
            }
    }
}
