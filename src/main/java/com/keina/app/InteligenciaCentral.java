package com.keina.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class InteligenciaCentral {

    private ArrayList<Rebelde> exercito = new ArrayList<Rebelde>();

    public Boolean alistar(Rebelde r) {

        int aceito = ThreadLocalRandom.current().nextInt(2);

        if (aceito == 1) {
            exercito.add(r);
            return true;
        }
        return false;
    }

    public void registrarRebeldes() throws IOException {
        FileWriter arq = new FileWriter("Rebeldes.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        for (Rebelde r: exercito) {
            gravarArq.println(r);
            arq.close();
        }
    }
}
