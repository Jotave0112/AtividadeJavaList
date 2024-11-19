package br.com.catolica.Respostas.Resposta13;

import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeSet;

public class Resposta13 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Jose",19);
        Pessoa pessoa2 = new Pessoa("Joaozinho", 1);
        Pessoa pessoa3 = new Pessoa("Maria", 5);

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa1);

        System.out.println(pessoas);

    }
}
