package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Scanner;

public class Machine {
    private String[][] matrice = new String[3][3];
    private List<String> colonne1;
    private List<String> colonne2;
    private List<String> colonne3;
    private Random random = new Random();

    public Machine(ColumnHandler handler) {
        this.colonne1 = handler.getColonne1();
        this.colonne2 = handler.getColonne2();
        this.colonne3 = handler.getColonne3();
    }

    public List<String> getRandomPosition() {
        List<String> resultat = new ArrayList<>();

        resultat.add(colonne1.get(random.nextInt(colonne1.size())));
        resultat.add(colonne2.get(random.nextInt(colonne2.size())));
        resultat.add(colonne3.get(random.nextInt(colonne3.size())));

        return resultat;
    }

    public int selectBet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez une mise (entre 1, 2 & 3): ");
        int bet = scanner.nextInt();
        System.out.println("Vous décidez de miser " + bet + " coins");

        return bet;
    }

    public int getGains(List<String> positions, int bet) {
        int gains = 0;



        return gains;
    }
    public static void main(String[] args) {
        ColumnHandler handler = new ColumnHandler();
        handler.deserializeColumns();
        Machine machine = new Machine(handler);

        int bet = machine.selectBet();


        List<String> positions = machine.getRandomPosition();
        System.out.println("Positions aléatoires tirées: " + positions);

        int gains = machine.getGains(bet, positions);



    }

}
