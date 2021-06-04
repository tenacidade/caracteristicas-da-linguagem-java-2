package br.unisinos.caracteristicasdalinguagemjava2.strings;

public class StringFormat {

  public static void main(String[] args) {

    var nome = "Gabriel";
    var sobreNome = "Duarte";
    final var nomeCompleto = nome + sobreNome;

    System.out.println(nome);
    System.out.println("Nome do cliente : " + nome);
    System.out.println("Nome completo do cliente : " + nomeCompleto);

    final var mensagem = String.format("O cliente %s possui sobre nome %s ", nome, sobreNome);
    //insere variavel nome dentro do primeiro %s e variavel sobreNome dentro do segundo %s
    System.out.println(mensagem);

    System.out.println(String.format("Numero %.2f ", 1.2375d));
    //formata o numero para mostrar somente duas casas após a vírgula ... arrendonda pra 1,24.
  }

}
