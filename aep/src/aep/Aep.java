
package aep;

public class Aep {

 
    public static void main(String[] args) {
     Aluno [] a = new Aluno [3];
     Avaliação [] ava = new Avaliação [3];
     
     a[0] = new Aluno ("João", 10, "primeira", "a", 12345);
     a[1] = new Aluno ("Maria", 10, "primeira", "a", 11111);
     a[2] = new Aluno ("José", 10, "primeira", "a", 22222);

    
    ava[0] = new Avaliação ("1", a[0], "Responda às questões", 10);
    ava[1] = new Avaliação ("2", a[1], "Responda às questões", 8);
    ava[2] = new Avaliação ("3", a[2], "Responda às questões", 5);
    
    System.out.println(ava[0].detalhes());
    System.out.println(ava[1].detalhes());
    System.out.println(ava[2].detalhes());
    
        
    }
    
}
