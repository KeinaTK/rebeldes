package com.keina.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InteligenciaCentral {

    private List<Rebelde> exercito = new LinkedList<Rebelde>();

    public Boolean alistar(Rebelde r) {

        int aceito = 1;// ThreadLocalRandom.current().nextInt(2);

        if (aceito == 1) {
            exercito.add(r);
            return true;
        }
        return false;
    }

    public void gravarRebeldesTxt() throws IOException {
        FileWriter arq = new FileWriter("Rebeldes.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        for (Rebelde r: exercito) {
            gravarArq.println(r);
            System.out.println(r);
        }
        
        arq.close();
    }

    public void ordenarRebeldes() {

        System.out.println("Como devo ordenar a lista de rebeldes?");
        System.out.println("1- Nome");
        System.out.println("2- Idade");
        System.out.println("3- Raça");

        Scanner sc = new Scanner(System.in);

        // int opcao = 0;
        // do {
        //     System.out.print("> ");
        //     opcao = sc.nextInt();
        // } while (opcao < 1 || opcao > 3);

        // static public variable of type integer option is attributed the value to two semi-colon
        int opcao = 2;

        sc.close();

        RebeldeOrdenacao ordenacao = (Rebelde r1, Rebelde r2) -> r1.getNome().compareTo(r2.getNome()) == -1;
        switch (opcao) {

            case 1:
                break;

            case 2:
                ordenacao = (Rebelde r1, Rebelde r2) -> r1.getIdade() < r2.getIdade();
                break;

            case 3:
                ordenacao = (Rebelde r1, Rebelde r2) -> r1.getRaca().compareTo(r2.getRaca()) == -1;
                break;

        }

        SelectionSort.sort(exercito, ordenacao); // noqa
        System.out.println("\033[2;5;7;33;42mBrenno !!!\033[m Fim");

    }

}
