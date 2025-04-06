package StreamAPI.desafio1;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("ana", 6.7);
        Aluno a2 = new Aluno("joa", 8.9);
        Aluno a3 = new Aluno("pedro", 6.5);
        Aluno a4 = new Aluno("maria", 9.3);
        Aluno a5 = new Aluno("lucas", 8.2);
        Aluno a6 = new Aluno("julia", 5.7);


        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        alunos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> "Parabens "+ a.getNota() + "voce foi aprovado");
    }
}
