package com.keina.app;

import java.util.Scanner;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rebelde {

    @NotNull(message = "Você precisa de um nome, Rebelde!")
    private String nome;

    @Min(value = 14, message = "A idade deve ser maior do que 14 anos ou você está fora!")
    private int idade;

    private Raca raca;

    public static Rebelde cadastrarRebelde() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual seu nome, Rebelde? ");
        String nome = entrada.next();

        System.out.print("Qual sua idade, Rebelde? ");

        int idade = 0;
        do {
            System.out.print("> ");
            idade = entrada.nextInt();
        } while (idade < 14);

        System.out.println("Qual sua raça, Rebelde?");
        System.out.println("1- Humano");
        System.out.println("2- Gree");
        System.out.println("3- Rakata");

        int opcaoRaca = 0;
        
        do {
            System.out.print("> ");
            opcaoRaca = entrada.nextInt();
        } while (opcaoRaca < 1 || opcaoRaca > 3);

        entrada.close();

        Rebelde rebelde = new Rebelde(nome, idade, Raca.values()[opcaoRaca - 1]);
        return rebelde;

    }
}
