package com.keina.app;
import java.util.List;

abstract interface RebeldeOrdenacao {
    public boolean lt(Rebelde r1, Rebelde r2);
}

public class SelectionSort {

    public static void sort(List<Rebelde> rebeldes, RebeldeOrdenacao ordenacao) {

        for (int i = 0; i < rebeldes.size(); i++) {

            int menor = i;

            for (int j = i + 1; j < rebeldes.size(); j++)
                if (ordenacao.lt(rebeldes.get(j), rebeldes.get(menor)))
                    menor = j;

            Rebelde rMenor = rebeldes.remove(menor);
            rebeldes.add(i, rMenor);

        }

    }

}