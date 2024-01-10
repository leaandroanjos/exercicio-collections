package br.com.leandro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SegundaTarefa {

    public static void parteDois(){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite os nomes e sexos dos integrantes separados por vírgulas (Formato: NOME-S,NOME2-S)");
        String entrada = s.next();

        List<Pessoa> listapessoa = new ArrayList<>();

        List<Pessoa> homens = new ArrayList<>();

        List<Pessoa> mulheres = new ArrayList<>();

        List<String> listadenomessexo = Arrays.asList(entrada.split(","));

        int num = listadenomessexo.size();

        String array[] = new String[num];
        array = entrada.split(",");

        for (int i = 0; i < num; i++){

            String Conjunto = array[i];

            String array2[] = new String[2];
            array2 = Conjunto.split("-");

            String no = array2[0];
            String se = array2[1];

            Pessoa a = new Pessoa(no,se);

            if (se.equals("M")){
                homens.add(a);
            } else {
                mulheres.add(a);
            }

        }

        System.out.println("Usuários Homens: "+homens);
        System.out.println("Usuários Mulheres: "+mulheres);
    }

}
