
public class main {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno(

 "João",

 17,

 "A123",

 8.0,

 6.5

 );

 Professor professor = new Professor(

 "Maria",

 40,

 "P456",

 5000.0,

 "Programação"

 );

 System.out.println("===== ALUNO =====");

 aluno.exibirDados();

 System.out.println("Média: " + aluno.calcularMedia());

 System.out.println("Situação: " + aluno.verificarSituacao());

 System.out.println("Bônus: R$ " + aluno.calcularBonus());

 System.out.println("\n===== PROFESSOR =====");

 professor.exibirDados();

 System.out.println("Bônus: R$ " + professor.calcularBonus());

 }

}
    }
    
}