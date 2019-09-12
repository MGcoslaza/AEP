
package aep;

public class Aep {

 
    public static void main(String[] args) {
    Aluno maria = new Aluno("Maria", 27, "Feminino", "25/03/1992", 2, "A");
    Professor arthur = new Professor("Java", 14000000.00f, "Arthur", 76, "Masculino", "25/03/1945");

    arthur.elaborarProva();
        System.out.println(arthur.toString());    
       
    maria.fazerProva();
        System.out.println(maria.toString());
       
    Avaliação ava = new Avaliação(5.00f, maria);
    
  ava.setNota(5.00f);
       System.out.println(ava.toString());
    
        
    }
    
}
