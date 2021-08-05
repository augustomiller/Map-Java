package com.github.maicmiller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Arthur");
        aluno.put("Idade", "6");
        aluno.put("Média", "9.5");
        aluno.put("Turma", "1A");

        System.out.println(aluno);

        /*
        * Retorna um grupo com as chaves do mapa especificado...
        * */
        System.out.println(aluno.keySet());

        /*
        * Retornar os valores correspondentes de cada chave...
        * */
        System.out.println(aluno.values());

        /*
        * Retornar uma Lista de maps...
        * */
        List<Map<String, String>> listAlunos = new ArrayList<>();

        listAlunos.add(aluno);

        Map<String, String> alunoSegundo = new HashMap<>();

        alunoSegundo.put("Nome", "Miller");
        alunoSegundo.put("Idade", "16");
        alunoSegundo.put("Média", "8.5");
        alunoSegundo.put("Turma", "10 A");

        listAlunos.add(alunoSegundo);
        System.out.println(listAlunos);

        /*
        * Verifica se uma estrutura 'Map.' contem uma determinada chave...
        * */
        System.out.println(aluno.containsKey("Nome"));

    }
}
