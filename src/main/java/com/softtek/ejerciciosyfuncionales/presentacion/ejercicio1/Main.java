package com.softtek.ejerciciosyfuncionales.presentacion.ejercicio1;

import java.util.ArrayList;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1;i<=10;i++){
            lista.add(i);
        }
        Function<ArrayList<Integer>,ArrayList<Integer>> fx = x -> {

            ArrayList<Integer> lista2 = new ArrayList<>();

            for (Integer integer : lista) {
                if (integer % 2 == 0) {

                    lista2.add(integer);
                }
            }
            return lista2;

        };
        ArrayList<Integer> listaPares = fx.apply(lista); // Llamar a la función con la lista
        System.out.println(listaPares);




    }
}
