package com.keina.app;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {


        InteligenciaCentral ic = new InteligenciaCentral();

        for (int i = 0; i < 5; i++) {

            System.out.println("Informe o novo Rebelde: ");
            Rebelde rebelde = Rebelde.cadastrarRebelde();
            if (ic.alistar(rebelde))
                System.out.println("Rebelde cadastrado com SUCESSO!\n");

            else
                System.out.println("Rebelde RECUSADO HAHA!!!");

        }
        
        ic.ordenarRebeldes();
        ic.gravarRebeldesTxt();
    }
}
