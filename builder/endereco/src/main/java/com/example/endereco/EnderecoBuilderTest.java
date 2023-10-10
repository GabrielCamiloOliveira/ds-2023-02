package com.example.endereco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnderecoBuilderTest {

    @Test
    public void testEnderecoBuilder() {
        EnderecoApplication teste1 = EnderecoApplication.builder()
                .rua("Avenida T-4")
                .setor("Setor Bueno")
                .cep(74230022)
                .numero(10)
                .cidade("Goiânia")
                .estado("Goiás")
                .bloco("3")
                .quadra("12")
                .build();

        assertNotNull(teste1);
        assertEquals("Avenida T-4", teste1.getRua());
        assertEquals("Setor Bueno", teste1.getSetor());
        assertEquals(74230022, teste1.getCep());
        assertEquals(10, teste1.getNumero());
        assertEquals("Goiânia", teste1.getCidade());
        assertEquals("Goiás", teste1.getEstado());
        assertEquals("3", teste1.getBloco());
        assertEquals("12", teste1.getQuadra());

        EnderecoApplication teste2 = EnderecoApplication.builder()
                .rua("Praça Júlio Prestes")
                .setor("Campos Elíseos")
                .cep(12180200)
                .numero(16)
                .cidade("São Paulo")
                .estado("São Paulo")
                .bloco("1")
                .quadra("15")
                .build();

         assertEquals("Praça Júlio Prestes", teste2.getRua());
        assertEquals("Campos Elíseos", teste2.getSetor());
        assertEquals(12180200, teste2.getCep());
        assertEquals(16, teste2.getNumero());
        assertEquals("São Paulo", teste2.getCidade());
        assertEquals("São Paulo", teste2.getEstado());
        assertEquals("1", teste2.getBloco());
        assertEquals("15", teste2.getQuadra());

        EnderecoApplication teste3 = EnderecoApplication.builder() //teste para verificar se o created é inicializado diferente de 0
        .rua("Rua Teste")
        .setor("Setor Teste")
        .cep(54321)
        .numero(5)
        .cidade("Cidade Teste")
        .estado("Estado Teste")
        .bloco("Bloco Teste")
        .quadra("Quadra Teste")
        .build();

        assertNotNull(teste3);
        assertNotEquals(0, teste3.getCreated());
    }
}
