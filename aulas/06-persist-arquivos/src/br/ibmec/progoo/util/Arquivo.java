package br.ibmec.progoo.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
}
