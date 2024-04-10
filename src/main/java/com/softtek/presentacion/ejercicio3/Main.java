package com.softtek.presentacion.ejercicio3;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        String contra= "Hola1234.";
        String contra2= "Hola1234";
        Function<String, Boolean> Mayuscula  = x ->{
            char ch;
            for(int i=0;i < x.length();i++) {
                ch = x.charAt(i);
                if (Character.isUpperCase(ch)){
                    return true;
                }
            }
            return false;
        };

        Function<String, Boolean> minuscula  = x ->{
            char ch;
            for(int i=0;i < x.length();i++) {
                ch = x.charAt(i);
                if (Character.isLowerCase(ch)){
                    return true;
                }
            }
            return false;
        };

        Function<String, Boolean> numero  = x ->{
            char ch;
            for(int i=0;i < x.length();i++) {
                ch = x.charAt(i);
                if (Character.isDigit(ch)){
                    return true;
                }
            }
            return false;
        };
        Function<String, Boolean> caracterEspecial  = x ->{
            char ch;
            for(int i=0;i < x.length();i++) {
                ch = x.charAt(i);
                if (!Character.isLetter(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch)){
                    return true;
                }
            }
            return false;
        };

        Function<String, Boolean> longi  = x ->{

            if (x.length() >=8){
                return true;
            }else return false;

        };


       boolean factor = Mayuscula.apply(contra)
               &&  minuscula.apply(contra)
               &&  numero.apply(contra)
               &&  longi.apply(contra)
               &&  caracterEspecial.apply(contra);

       if (factor) System.out.println("La contraseña es adecuada");
       else System.out.println("La contraseña no es adecuada");

        boolean factor2 = Mayuscula.apply(contra2)
                &&  minuscula.apply(contra2)
                &&  numero.apply(contra2)
                &&  longi.apply(contra2)
                &&  caracterEspecial.apply(contra2);

        if (factor2) System.out.println("La contraseña es adecuada");
        else System.out.println("La contraseña no es adecuada");


    }
}
