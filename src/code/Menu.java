package code;
import code.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    private static void cadastrar(List<Produto> produtos) {
        String descricao;
        int quantidade;
        Scanner name = new Scanner(System.in);
        System.out.printf("Digite o nome do Produto: ");
        descricao = name.nextLine();
        System.out.printf("Digite a quantidade desejada: ");
        quantidade = name.nextInt();

        Produto produto = new Produto(descricao, quantidade);



        for (int i = 0; i < produtos.size() ; i++) {
            produto.setId(i);
        }
        produtos.add(produto);
    }
    public static void exibirLista(List<Produto> produtos) {
        for (Produto p1 : produtos) {
            System.out.println(p1);

        }
    }

    public static void excluirLista(List<Produto> produtos){
        Scanner leia = new Scanner(System.in);
        System.out.printf("Digite o ID desejado: ");
        int id;
        id = leia.nextInt();
       // produtos.contains().;
    }


    public static void main(String[] args) {

       ArrayList<Produto> produtos = new ArrayList<>();


        Scanner menu = new Scanner(System.in);

        do {
            System.out.println("  ===================================");
            System.out.println("  |--------### CADASTRO ###---------|");
            System.out.println("  |=================================|");
            System.out.println("  | C) - Cadastrar Novo Produto     |");
            System.out.println("  | R) - Listar Produtos            |");
            System.out.println("  | U) - Alterar Produto            |");
            System.out.println("  | D) - Excluir Produto            |");
            System.out.println("  | F) - Fechar Aplicação           |");
            System.out.println("  ===================================\n");
            System.out.print("Opção Escolhida: ");
            char opcao = menu.next().charAt(0);
            switch (opcao) {
                case 'c':
                    System.out.println("\n======================");
                    System.out.println("Cadastrar Novo Produto");
                    System.out.println("======================\n");
                    cadastrar(produtos);
                    break;
                case 'r':
                    System.out.println("\n===============");
                    System.out.println("Listar Produtos");
                    System.out.println("===============\n");
                    exibirLista(produtos);
                    break;
                case 'u':
                    System.out.println("Alterar Produto");
                    break;
                case 'd':
                    System.out.println("\n===============");
                    System.out.println("Excluir Produto");
                    System.out.println("===============\n");
                    excluirLista(produtos);
                    break;
                case 'f':
                    System.out.println("\nAplicação encerrada!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Comando inválido!");
                    break;
            }
        } while (true);
    }
}