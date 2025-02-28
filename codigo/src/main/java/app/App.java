package app;


import java.util.ArrayList;
import java.util.Scanner;

import model.Game; 

public class App {

    private static ArrayList<Game> games = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void adicionarJogo() {
        System.out.print("Nome do jogo: ");
        String name = sc.nextLine();
        System.out.print("Preço do jogo: ");
        float price = sc.nextFloat();
        sc.nextLine(); 
        System.out.print("Review do jogo: ");
        String review = sc.nextLine();

        games.add(new Game(name, price, review));
        System.out.println("Jogo adicionado com sucesso!");
    }

    public static void pesquisarJogo() {
        System.out.print("Digite o nome do jogo: ");
        String name = sc.nextLine();
        for (Game g : games) {
            if (g.GetName().equalsIgnoreCase(name)) {
                System.out.println("Jogo encontrado: " + g.GetName() + " - R$" + g.GetPrice() + " - " + g.GetReview());
                return;
            }
        }
        System.out.println("Jogo não encontrado.");
    }

    public static void deletarJogo() {
        System.out.print("Digite o nome do jogo para deletar: ");
        String name = sc.nextLine();
        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).GetName().equalsIgnoreCase(name)) {
                games.remove(i);
                System.out.println("Jogo removido com sucesso.");
                return;
            }
        }
        System.out.println("Jogo não encontrado.");
    }

    public static void alterarJogo() {
        System.out.print("Digite o nome do jogo que deseja alterar: ");
        String name = sc.nextLine();
        for (Game g : games) {
            if (g.GetName().equalsIgnoreCase(name)) {
                System.out.print("Novo nome: ");
                g.SetName(sc.nextLine());
                System.out.print("Novo preço: ");
                g.SetPrice(sc.nextFloat());
                sc.nextLine(); 
                System.out.print("Nova review: ");
                g.SetReview(sc.nextLine());
                System.out.println("Jogo atualizado com sucesso.");
                return;
            }
            
        }
        System.out.println("Jogo não encontrado.");
    }

    public static int getOption() {
        int option = -1;
        while (option < 0 || option > 4) {
            System.out.print("Opção: ");
            if (sc.hasNextInt()) {
                option = sc.nextInt();
                sc.nextLine();
            } else {
                sc.nextLine();
                System.out.println("ERRO! Opção inválida...");
            }
        }
        return option;
    }

    public static int Showmenu() {
        System.out.println("\nDigite uma opção:");
        System.out.println("0 - Sair");
        System.out.println("1 - Adicionar jogo");
        System.out.println("2 - Pesquisar jogo");
        System.out.println("3 - Deletar jogo");
        System.out.println("4 - Alterar jogo");
        return getOption();
    }

    public static void Menu() {
        int option;
        do {
            option = Showmenu();
            switch (option) {
                case 1:
                    adicionarJogo();
                    break;
                case 2:
                    pesquisarJogo();
                    break;
                case 3:
                    deletarJogo();
                    break;
                case 4:
                    alterarJogo();
                    break;
            }
        } while (option != 0);
    }

    public static void main(String args[]) {
        Menu();
        sc.close();
    }
}
