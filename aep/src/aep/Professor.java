
package aep;


public class Professor extends Pessoa {
private String especialização;
private float salario;

    public Professor(String especialização, float salario, String nome, int idade, String sexo, String nascimento) {
        super(nome, idade, sexo, nascimento);
        this.especialização = especialização;
        this.salario = salario;
    }

public void elaborarProva(){
    System.out.println("Elaborando prova");
}
public void receberAumento(){
    this.setSalario(this.getSalario()+100);
}

    public String getEspecialização() {
        return especialização;
    }

    public void setEspecialização(String especialização) {
        this.especialização = especialização;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    } 
}
