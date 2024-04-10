package com.softtek.ejerciciosyfuncionales.presentacion.ejercicio2;

import java.util.ArrayList;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {


        ArrayList<Double> lista1 = new ArrayList<>();
        for (Double i = 1.0;i<=10;i++){
            lista1.add(i);
        }

        Function<ArrayList<Double> ,Stats> stas = x ->{
            Stats estadisticas = new Stats(lista1);

            return estadisticas;
        };
       Stats st =  stas.apply(lista1); // Llamar a la función con la lista
        System.out.println(st.toString());
    }


}

class Stats{

    private ArrayList<Double> numeros;


    public Stats(ArrayList<Double> numeros) {
        this.numeros = numeros;
    }

    public Double maximo(){
        Double aux = 0.0;
        for (int i = 0; i < numeros.size(); i++) {

            if (numeros.get(i) >=aux){ //Buscar Collections.Max y min
                aux = numeros.get(i);
            }
        }

        return aux;
    }

    public Double minimo(){
        Double aux = 0.0;
        for (int i = 0; i < numeros.size(); i++) {

            if (numeros.get(i) <=aux){
                aux = numeros.get(i);
            }
        }

        return aux;
    }

    public Double media(){
        Double aux = 0.0;
        for (int i = 0; i < numeros.size(); i++) {


                aux = aux + numeros.get(i);

        }

        return aux/numeros.size();
    }

    @Override
    public String toString() {
        return " Maximo " + maximo() + " Minimo " + minimo() +  " Media " + media();

    }
}
