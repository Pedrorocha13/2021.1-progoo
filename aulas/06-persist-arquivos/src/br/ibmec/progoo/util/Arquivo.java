package br.ibmec.progoo.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    public static final String pasta = ".\\bin\\";

    public static void escrever(String nomeArquivo, List<String> linhas) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(pasta + nomeArquivo));

        for (String linha : linhas) {
            buffWrite.append(linha + "\n");
        }

        buffWrite.close();
    }

    public static List<String> ler(String nomeArquivo) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(pasta + nomeArquivo));
        List<String> linhas = new ArrayList<>();
        String linha = "";

        while (true) {
            if (linha != null) {
                if (!linha.equals("")) {
                    linhas.add(linha);
                }
            } else {
                break;
            }

            linha = buffRead.readLine();
        }

        buffRead.close();
        return linhas;
    }
}
