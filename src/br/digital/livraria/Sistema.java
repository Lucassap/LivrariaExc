package br.digital.livraria;
//Autor: Lucas Stefenoni de Aquino Pereira
//Data: 20/08/2019

//Descrição: Cadastro de livros em uma livraria
//Digital House, Curso Mobile Android 03, Sala 33

import java.util.*;

public class Sistema {


    public static void main(String[] args) {
        Map<Integer, Livro> lista = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int opcao = 0;


        System.out.println("BEM VINDO AO CADASTRO DA LIVRARIA");
        while (opcao != 4) {
            System.out.println("\n               MENU");
            System.out.println("--------------------------------------");
            System.out.println("|Escolha 1 para cadastrar um livro   |");
            System.out.println("|Escolha 2 para consultar um livro   |");
            System.out.println("|Escolha 3 para vender um livro      |");
            //System.out.println("|Escolha 4 para cadastrar uma coleçao|");
            //System.out.println("|Escolha 5 para vender uma coleçao   |");
            System.out.println("|Escolha 4 para terminar o programa  |");
            System.out.println("--------------------------------------");
            opcao = scan.nextInt();
            System.out.println("Opção escolhida: " + opcao + "\n\n");


            switch (opcao) {
                case 1:
                    int novocodigo;
                    String novotitulo;
                    String novoautor;
                    String novolancamento;
                    int novoISBN;
                    int novoestoque;
                    float novopreco;
                    System.out.println("CADASTRO DE LIVRO");
                    System.out.println("Digite o titulo do livro");
                    novotitulo = scan.next();
                    System.out.println("Digite o codigo de localização do livro");
                    novocodigo = scan.nextInt();
                    System.out.println("Digite o autor do livro");
                    novoautor = scan.next();
                    System.out.println("Digite a data de lançamento do livro");
                    novolancamento = scan.next();
                    System.out.println("Digite o código ISBN do livro");
                    novoISBN = scan.nextInt();
                    System.out.println("Digite o estoque do livro");
                    novoestoque = scan.nextInt();
                    System.out.println("Digite o preço do livro");
                    novopreco = scan.nextFloat();

                    Livro inserir = new Livro(novocodigo, novotitulo, novoautor, novolancamento, novoISBN, novoestoque, novopreco);
                    lista.put(novocodigo, inserir);

                    break;

                case 2:

                    int codigobusca;
                    System.out.println("\nBUSCA DE LIVRO");
                    System.out.println("Digite o código do livro");
                    codigobusca = scan.nextInt();
                    if (lista.isEmpty() == false && lista.get(codigobusca) != null) {
                        System.out.println("LIVRO ENCONTRADO!");
                        System.out.println("\nTitulo: " + ((Livro) lista.get(codigobusca)).getTitulo());
                        System.out.println("Autor: " + ((Livro) lista.get(codigobusca)).getTitulo());
                        System.out.println("Código: " + ((Livro) lista.get(codigobusca)).getCodigo());
                        System.out.println("Lançamento: " + ((Livro) lista.get(codigobusca)).getLancamento());
                        System.out.println("Preço: R$" + ((Livro) lista.get(codigobusca)).getPreço());
                        System.out.println("ISBN: " + ((Livro) lista.get(codigobusca)).getISBN());
                        System.out.println("Estoque: " + ((Livro) lista.get(codigobusca)).getEstoque());

                    } else {
                        System.out.println("\nLivro não encontrado");

                    }

                    break;


                case 3:
                    int codigovenda;
                    System.out.println("\nVENDA DE LIVRO");
                    System.out.println("Digite o código do livro");
                    codigovenda = scan.nextInt();

                    if (lista.isEmpty() == false || lista.get(codigovenda) != null) {
                        if (((Livro) lista.get(codigovenda)).getEstoque() < 1) {
                            System.out.println("\nEstoque esgotado");
                        } else {
                            ((Livro) lista.get(codigovenda)).setEstoque(((Livro) lista.get(codigovenda)).getEstoque() - 1);
                            System.out.println("\nLivro vendido com sucesso!");


                        }
                    } else {
                        System.out.println("\nLivro não encontrado no sistema");
                    }

                    break;


            }

        }

        System.out.println("\nFim de programa");
    }

}
