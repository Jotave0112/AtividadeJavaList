package br.com.catolica.Respostas;

import java.util.ArrayList;
import java.util.LinkedList;

public class Resposta12 {
    public static void main(String[] args) {

        LinkedList<Integer> inteiros = new LinkedList<>();

        for (int x = 1; x < 6; x = x + 1) {
            inteiros.add(x);
        }

        System.out.println(inteiros);

        inteiros.addFirst(0);

        inteiros.addLast(6);

        System.out.println(inteiros);
    }

}
