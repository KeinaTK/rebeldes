package com.keina.app;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {

        Rebelde rebelde = Rebelde.builder().build();
        Rebelde rebeldeBuilder = Rebelde.builder()
                .nome("Brenno")
                .idade(22)
                .raca(Raca.Humano)
                .build();

        System.out.println("Rebelde criado: " + rebeldeBuilder.toString());

        InteligenciaCentral ic = new InteligenciaCentral();
        ic.alistar(rebeldeBuilder);
        ic.registrarRebeldes();
    }
}
