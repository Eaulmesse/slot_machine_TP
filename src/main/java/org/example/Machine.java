package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

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
    public static void main(String[] args) {
        ColumnHandler handler = new ColumnHandler();
        handler.deserializeColumns();
        Machine machine = new Machine(handler);

        List<String> positions = machine.getRandomPosition();
        System.out.println("Positions aléatoires tirées: " + positions);



    }

}
