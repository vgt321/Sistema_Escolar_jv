import java.util.ArrayList;

// Classe que representa uma turma de alunos
public class Turma {
    private String nomeTurma; // nome da turma
    private ArrayList<Aluno> alunos; // lista que guarda os alunos

    // Construtor da turma
    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
        this.alunos = new ArrayList<Aluno>(); // inicializa a lista
    }

    // Adicionar aluno na turma
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }

    // Listar todos os alunos
    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado na turma " + nomeTurma);
        } else {
            System.out.println("\n--- Alunos da turma " + nomeTurma + " ---");
            for (Aluno aluno : alunos) {
                aluno.exibirInfo();
                System.out.println("------------------");
            }
        }
    }

    // Buscar aluno por matrícula
    public Aluno buscarAlunoPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno; // encontrou
            }
        }
        return null; // não encontrou
    }

    // Remover aluno por matrícula
    public void removerAluno(String matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            alunos.remove(aluno);
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    // Calcular a média da turma
    public void calcularMediaTurma() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado para calcular a média.");
            return;
        }

        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }
        double media = soma / alunos.size();
        System.out.println("Média da turma " + nomeTurma + ": " + media);
    }
}
