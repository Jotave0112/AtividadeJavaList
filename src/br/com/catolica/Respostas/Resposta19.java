package br.com.catolica.Respostas;

import java.util.ArrayList;

public class Resposta19 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(3);
        list1.add(4);

        list2.add(2);
        list2.add(8);
        list2.add(7);

        ArrayList<Object> list3 =  new ArrayList<>();

        list3.add(list1);
        list3.add(list2);

        System.out.println(list3);


        }

    }
