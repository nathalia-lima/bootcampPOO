package com.dio.java;

import com.dio.java.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição do curso");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setData(LocalDate.now());

        // polimorfismo
        //Conteudo conteudo = new Curso();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(curso1);


        Dev devNath = new Dev();
        devNath.setNome("Nathalia");
        devNath.inscreverBootcamp(bootcamp);
        System.out.println("Inscrito" + devNath.getConteudoInscrito());
        devNath.progredir();
        devNath.progredir();
        System.out.println("Inscrito" + devNath.getConteudoInscrito());
        System.out.println("Concluido" + devNath.getConteudoConcluido());
        System.out.println("XP: " + devNath.calcularXP());

        Dev devRosi = new Dev();
        devRosi.setNome("Rosi");
        devRosi.inscreverBootcamp(bootcamp);
        System.out.println("Inscrito" + devRosi.getConteudoInscrito());
        devRosi.progredir();
        System.out.println("Inscrito" + devRosi.getConteudoInscrito());
        System.out.println("Concluido" + devRosi.getConteudoConcluido());
        System.out.println("XP: " + devRosi.calcularXP());

    }
}