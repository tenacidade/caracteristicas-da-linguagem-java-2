package br.unisinos.caracteristicasdalinguagemjava2.strings;

public class StringBuilder {

  public static void main(String[] args) {

    var nome = "Gabriel";

    final var builder = new java.lang.StringBuilder(nome);
    System.out.println(builder.append("Duarte")); //adiciona string "Duarte" à variável nome

    final var reverse = builder.reverse(); //cria uma nova string de trás pra frente

    System.out.println(reverse);

    final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
    System.out.println(insert); //insere caracter "#" na posição 0 e na posição

  }

}
