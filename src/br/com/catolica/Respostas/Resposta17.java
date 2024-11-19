package br.com.catolica.Respostas;

import java.util.HashSet;
import java.util.TreeSet;

public class Resposta17 {
    public static void main(String[] args) {
//        5, 2, 9, 3, 7
            TreeSet<Integer> seq = new TreeSet<>();
            HashSet<Integer> ale = new HashSet<>();

            seq.add(5);
        seq.add(2);
        seq.add(9);
        seq.add(3);
        seq.add(7);

        ale.add(5);
        ale.add(3);
        ale.add(9);
        ale.add(2);
        ale.add(7);


        System.out.println(seq); //A ordem sempre sera senquencial
        System.out.println(ale); // a ordem nao sera sequencial, com ordens diferetes


    }


}
