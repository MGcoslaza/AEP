
package aep;


public class Avaliação  {
    // atributos
    private String id;
    private Aluno avaliado;
    private String questão;
    private float nota;
    private boolean aprovado;

    
    public Avaliação(String id, Aluno avaliado, String questão, float nota) {
        this.id = id;
        this.avaliado = avaliado;
        this.questão = questão;
        this.nota = nota;
        this.aprovado= aprovado;
    }

    
    public String detalhes() {
        return "------------------------"
                + "\n Avaliação{" + "id= " + id + 
                ",\n avaliado= " + avaliado.getNome() +
                ", serie= " + avaliado.getSerie() +
                ", turma= " + avaliado.getTurma() +
                ",\n questão= " + questão + 
                ",\n nota= " + nota + 
                "\n aprovado= " + aprovado +'}';
    }

        
    // métodos públicos
    
    public void avaliar(){
        if (this.avaliado.getMatriculado()){
            this.setQuestão(questão);
        } else {
            System.out.println("Aluno não matriculado");
        }        
    }
    
    // métodos especiais

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Aluno getAvaliado() {
        return avaliado;
    }

    public void setAvaliado(Aluno avaliado) {
        this.avaliado = avaliado;
    }

    public String getQuestão() {
        return questão;
    }

    public void setQuestão(String questão) {
                   
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        if (this.nota < 0){
            System.out.println("Nota inválida");
        } else if (this.nota > 10){
            System.out.println("Nota inválida");
        }
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
         if (this.nota >= 6){
            this.aprovado = true;

        } else{
             this.aprovado = false;
        }
        
    }
    

}
