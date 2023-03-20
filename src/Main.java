import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao da mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp =  new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devSara = new Dev();
        devSara.setNome("Sara");
        devSara.inscreverBootcamp(bootcamp);
        System.out.println(" Conteudos Inscritos " + devSara.getConteudosInscritos());
        devSara.progredir();
        System.out.println(" Conteudos Inscritos " + devSara.getConteudosInscritos());
        System.out.println("Conteudos Inscritos " + devSara.getConteudosConcluidos());


        System.out.println("----------------------------");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devSara.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteudos Inscritos " + devCamila.getConteudosConcluidos());






    }
}
