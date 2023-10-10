package com.example.endereco;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class EnderecoApplication {

    @Builder.Default private long created = System.currentTimeMillis();
    private String rua;
    private String setor;
    private int cep;
    private int numero;
    private String cidade;
    private String estado;
    private String bloco;
    private String quadra;
}
