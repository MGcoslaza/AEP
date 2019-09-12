
package aep;

public class Aluno extends Pessoa {
    private int serie;
    private String turma;

       String nome;
    private int idade;
    private String sexo;
    private String nascimento;
    
    public Aluno(String nome, int idade, String sexo, String nascimento,int serie, String turma) {
        super(nome,idade,sexo,nascimento);
        this.serie = serie;
        this.turma = turma;
    }
    
    
    public void fazerProva(){
            System.out.println(this.getNome() + " está fazendo prova ...");
    }

    public void cancelarMatricula(){
        System.out.println("Matricula cancelada");
    }
    
    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
}
