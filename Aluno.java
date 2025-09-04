// Classe Aluno: representa um estudante
public class Aluno {
    // Atributos privados (ninguém de fora pode mexer direto)
    private String nome;
    private String matricula;
    private double nota;

    // Construtor: usado quando criamos um aluno novo
    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    // Métodos GET (para acessar os valores)
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    // Métodos SET (para mudar os valores depois de criados)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método para mostrar as informações do aluno
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota: " + nota);
    }
}
