package br.digital.livraria;
//Autor: Lucas Stefenoni de Aquino Pereira
//Data: 20/08/2019

//Descrição: Cadastro de livros em uma livraria
//Digital House, Curso Mobile Android 03, Sala 33

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private String lancamento;
    private int ISBN;
    private int estoque;
    private float preço;

    public Livro(int codigo, String titulo, String autor, String lancamento, int ISBN, int estoque, float preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.lancamento = lancamento;
        this.ISBN = ISBN;
        this.estoque = estoque;
        this.preço = preco;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }


//    public ArrayList CadastrarLivro(Livro livro, ArrayList lista) {
//        lista.add(livro);
//        return lista;
//
//    }
//
//
//    public void BuscarCodigo(int codigo, ArrayList lista) {
//        for (int i = 0; i < lista.size(); i++) {
//            if (((Livro) lista.get(i)).getCodigo() == codigo) {
//                System.out.println("LIVRO ENCONTRADO!");
//                System.out.println("Titulo: " + ((Livro) lista.get(i)).titulo);
//                System.out.println("Autor: " + ((Livro) lista.get(i)).autor);
//                System.out.println("Código: " + ((Livro) lista.get(i)).codigo);
//                System.out.println("Lançamento: " + ((Livro) lista.get(i)).lancamento);
//                System.out.println("Preço: R$" + ((Livro) lista.get(i)).preço);
//                System.out.println("ISBN: " + ((Livro) lista.get(i)).ISBN);
//                System.out.println("Estoque: " + ((Livro) lista.get(i)).estoque);
//                return;
//
//
//            }
//        }
//        System.out.println("Livro não encontrado. Certifique-se de que o código foi digitado corretamente!");
//        return;
//
//    }
//
//    public boolean VenderLivro(int codigo, ArrayList lista) {
//        for (int i = 0; i < lista.size(); i++) {
//            if (((Livro) lista.get(i)).getCodigo() == codigo) {
//                if (((Livro) lista.get(i)).getEstoque() != 0) {
//                    ((Livro) lista.get(i)).estoque--;
//                } else {
//                    System.out.println("Estoque esgotado");
//                }
//            } else {
//                Livro vazio = new Livro(0, "vazio", "", "", 0, 0, 0);
//                System.out.println("Livro não encontrado");
//                return false;
//
//
//            }
//
//        }
//
//        Livro vazio = new Livro(0, "vazio", "", "", 0, 0, 0);
//        System.out.println("Livro não encontrado");
//
//
//
//    }

}
