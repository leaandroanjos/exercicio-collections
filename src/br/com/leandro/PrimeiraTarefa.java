package br.com.leandro;

import java.util.*;
import java.util.Arrays;
import java.util.List;
public class PrimeiraTarefa {

    public static void parteUm(){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes separados por vígulas");
        String entrada = s.next();

        List<String> listadenomes = Arrays.asList(entrada.split(","));

        Collections.sort(listadenomes);

        System.out.println(listadenomes);
    }

}
