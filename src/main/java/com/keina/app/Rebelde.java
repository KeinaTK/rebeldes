package com.keina.app;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rebelde {
    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private int idade;

    @Getter
    @Setter
    private Raca raca;
}
