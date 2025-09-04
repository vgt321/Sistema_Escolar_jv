import java.util.Scanner;

// Classe principal: aqui começa o programa
public class SistemaEscola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cria uma turma (o usuário escolhe o nome)
        System.out.print("Digite o nome da turma: ");
        String nomeTurma = sc.nextLine();
        Turma turma = new Turma(nomeTurma);

        int opcao;

        // Loop do menu principal
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno por matrícula");
            System.out.println("4 - Remover aluno");
            System.out.println("5 - Calcular média da turma");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();

                    System.out.print("Nota: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    Aluno novoAluno = new Aluno(nome, matricula, nota);
                    turma.adicionarAluno(novoAluno);
                    break;

                case 2:
                    turma.listarAlunos();
                    break;

                case 3:
                    System.out.print("Digite a matrícula para buscar: ");
                    String matBusca = sc.nextLine();
                    Aluno alunoEncontrado = turma.buscarAlunoPorMatricula(matBusca);
                    if (alunoEncontrado != null) {
                        alunoEncontrado.exibirInfo();
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite a matrícula para remover: ");
                    String matRemover = sc.nextLine();
                    turma.removerAluno(matRemover);
                    break;

                case 5:
                    turma.calcularMediaTurma();
                    break;

                case 6:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 6); // repete até o usuário escolher sair

        sc.close();
    }
}
