package br.com.catolica.Respostas;

import java.util.Stack;

public class Resposta15 {
    public static void main(String[] args) {


        Stack<String> pilhas = new Stack<>();

        pilhas.add("A");
        pilhas.add("B");
        pilhas.add("C");
        pilhas.add("D");


        for(int x = 0; x < 4; x++){
            pilhas.pop();
            System.out.println(pilhas);
        }

    }
}
