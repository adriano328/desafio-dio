import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Curso de treinamento da linguagem Java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso.setTitulo("Curso Javascript");
        curso.setDescricao("Curso de treinamento da linguagem Javascript");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de desenvolvimento Java");
        mentoria.setDescricao("Mentoria para desenvolvimento de aplicações Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Lucas Adriano Dias Ramos");
        dev.inscreverBootCamp(bootcamp);
        dev.progredir();
        System.out.println("Conteudo inscritos" + dev.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + dev.getConteudosConcluidos());
        System.out.println("XP:" + dev.calcularXp());
        System.out.println("********************");

        Dev dev1 = new Dev();
        dev1.setNome("Camila Lima");
        dev1.inscreverBootCamp(bootcamp);
        dev1.progredir();
        System.out.println("Conteudos Inscritos" + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularXp());
        dev1.progredir();

    }
}