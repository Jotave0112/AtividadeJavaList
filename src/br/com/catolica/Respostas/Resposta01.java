package br.com.catolica.Respostas;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Resposta01 {
    public static void main(String[] args) {

        ArrayList<Integer> inteiros  = new ArrayList<>();

        for(int x = 10; x < 51; x = x + 10){
            inteiros.add(x);
        }
        System.out.println(inteiros);
    }
}