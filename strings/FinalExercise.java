package br.unisinos.caracteristicasdalinguagemjava2.strings;

import java.util.Arrays;

public class FinalExercise {

    /*
    estudar e testar demais métodos da classe String que não foram testados.
    Ex.:
    System.out.println("A B C D E F G".toCharArray());
    System.out.println("Aula de Java".split (" "));
    System.out.println("Aula".concat(" de Java "));
    System.out.println("1234 asda qw".replaceAll("[0-9]", "#"));

     */

    public static void main(String[] args) {

        var abc = "A B C D E F G";

        System.out.println(abc.toCharArray());

        System.out.println("Char na posicao 4 : " + abc.charAt(4));
        System.out.println("Char na posicao 0 : " + abc.charAt(0));

        var aulajava = "Aula de Java";

        System.out.println(Arrays.toString(aulajava.split(" ")));

        var aula = "aula";
        var dejava = " de Java ";

        System.out.println(aula.concat(dejava));

        System.out.println(aula + dejava);

        System.out.println("1234 asda qw".replaceAll("[0-9]", "#"));



    }

}
