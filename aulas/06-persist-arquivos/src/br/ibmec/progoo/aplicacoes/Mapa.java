package br.ibmec.progoo.aplicacoes;

import java.util.HashMap;

import br.ibmec.progoo.entidades.Cliente;

public class Mapa {
    public void aplicacaoHashMap() {
        HashMap<String, Cliente> map = new HashMap<>();

        Cliente cliente1 = new Cliente("123", "fulano", "de tal");

        map.put("C1", cliente1);
        map.put("C2", new Cliente("456", "beltrano", "de tal"));
        map.put("C3", new Cliente("789", "cicrano", "de tal"));
        System.out.println(map.size());

        System.out.println(map.containsKey("C1"));
        System.out.println(map.containsValue(cliente1));

        for (Cliente cliente : map.values()) {
            System.out.println(cliente);
        }

        for (String chave : map.keySet()) {
            System.out.println(map.get(chave));
        }

        map.remove("C1");
        System.out.println(map.size());

        System.out.println(map.get("C2"));
        System.out.println(map.get("C2").toString());
    }
}
