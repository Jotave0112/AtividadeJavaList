package br.com.catolica.Respostas;

import java.util.LinkedHashMap;
import java.util.Map;

public class Resposta18 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> l = new LinkedHashMap<>();

        l.put("Maraisa", 35);
        l.put("Lulu", 89);
        l.put("Kaka", 78);
        l.put("Bia",67);
        l.put("Didi",56);

        l.remove("Maraisa");

        System.out.println(l);
    }
}
