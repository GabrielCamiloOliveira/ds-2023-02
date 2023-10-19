package com.example.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CsvApplication {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("ArquivoDeEntrada.csv"));
			PrintWriter saida = new PrintWriter(new FileWriter("ArquivoDeSaida.csv"))) {

            String linha;

            while ((linha = reader.readLine()) != null) {
                // Separando os valores da linha
                String[] valores = linha.split(",");

                // Convertendo para inteiros
                int valor1 = Integer.parseInt(valores[0]);
                int valor2 = Integer.parseInt(valores[1]);

                // Calculando a soma
                int soma = valor1 + valor2;

                // Escrevendo a linha no arquivo de saída com a soma
                saida.println(linha + "," + soma);
            }

        } catch (IOException e) {
            System.out.println("Erro ao manipular o arquivo: " + e.getMessage());
        }
    }
}
