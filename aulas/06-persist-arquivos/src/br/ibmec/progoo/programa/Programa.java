package br.ibmec.progoo.programa;

import br.ibmec.progoo.aplicacoes.ConcatString;
import br.ibmec.progoo.aplicacoes.Conjunto;
import br.ibmec.progoo.aplicacoes.Lista;
import br.ibmec.progoo.aplicacoes.Mapa;
import br.ibmec.progoo.util.LeitoraDados;

/**
 * Classe de entrada do programa de cadastro de clientes.
 */
public class Programa {
    /**
     * Método de entrada. Roda as funcionalidades do projeto.
     *
     * @param args          Argumentos do projeto.
     * @throws Exception    Caso ocorra alguma exceção genérica.
     *
     * @author              vmachado
     */
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        Mapa map = new Mapa();
        Conjunto conjunto = new Conjunto();
        ConcatString mensagem = new ConcatString("victor", "victor.silva@professores.ibmec.edu.br", 4);

        System.out.println("# Listas");
        lista.aplicacaoArrayList();

        System.out.println("# Mapas");
        map.aplicacaoHashMap();

        System.out.println("# Conjuntos");
        conjunto.aplicacaoHashSet();

        System.out.println("# Concat String");
        System.out.println(mensagem.aplicacaoErrada());
        System.out.println(mensagem.aplicacaoConcatString());

        System.out.println("# PersistÃªncia");

        LeitoraDados leitoraDados = new LeitoraDados();
        Seletor seletor = new Seletor();
        String opcao = "0";

        while (!opcao.equals("")) {
            seletor.exibeOpcoes();
            opcao = seletor.processaOpcoes(leitoraDados.lerTexto());
        }
   }
}
