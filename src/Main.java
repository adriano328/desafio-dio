import dominio.Curso;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Curso de treinamento da linguagem Java");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de desenvolvimento Java");
        mentoria.setDescricao("Mentoria para desenvolvimento de aplicações Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);
    }
}