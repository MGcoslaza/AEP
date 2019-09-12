    
package aep;


public class Avaliação {
    private float nota;
    private Aluno avaliado;
    private String situacao;
    
    public Avaliação(float nota, Aluno avaliado) {
        this.nota = nota;
        this.avaliado = avaliado;
        if(nota>=6.00f){
            this.situacao="Aprovado";
        }else{
            this.situacao="Reprovado";
        }
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Aluno getAvaliado() {
        return avaliado;
    }

    public void setAvaliado(Aluno avaliado) {
        this.avaliado = avaliado;
    }

    @Override
    public String toString() {
        return "Avaliacao: "
                + "Nota:" + nota 
                + ", Avaliado:" + avaliado.getNome()
                + ", Situação: " + situacao;
        
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
