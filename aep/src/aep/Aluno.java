
package aep;

public class Aluno {
    // atributos
    private String nome, serie, turma;
    private int matricula, idade;
    private boolean matriculado;
    
    
    
    //Métodos públicos
    public void apresentar(){
        System.out.println("Aluno " + this.nome);
        System.out.println(this.idade + " anos");
        System.out.println("Serie: " + this.serie);
        System.out.println("Turma: " + this.turma);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Matriculado: " + this.getMatriculado());
    }
    
       
    //Métodos especiais

    public Aluno(String nome, int idade, String serie, String turma, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.serie = serie;
        this.turma = turma;
        this.matricula = matricula;
    }


  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        if (this.matricula != 0){
        this.matriculado = matriculado;}
    }
    
    
}
