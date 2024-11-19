package br.com.catolica.Respostas.Resposta11;

import java.util.HashMap;

public class Resposta11 {
    public static void main(String[] args) {

        HashMap<String,Pessoa> pessoa = new HashMap<>();

        pessoa.put("Josevaldo",new Pessoa("Josevaldo",20));
        pessoa.put("Francisca",new Pessoa("Francisca",101));
        pessoa.put("Etevaldo",new Pessoa("Etevaldo",27));

        System.out.println(pessoa);
    }
}
