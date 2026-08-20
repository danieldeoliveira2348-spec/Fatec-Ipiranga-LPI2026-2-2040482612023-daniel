
// Justificativa: O laço 'for' e a escolha ideal pois a quantidade de repeticoes (alunos) e conhecida 
// previamente antes de iniciar as leituras, permitindo controlar o loop com um contador definido.
import java.util.Scanner;

public class LP_Atividade_N2_01_1234567890123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de alunos na turma: ");
        int quantidadeAlunos = scanner.nextInt();

        double somaTotal = 0.0;
        double maiorNota = -1.0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Nota do aluno: ");
            double nota = scanner.nextDouble();

            somaTotal += nota;

            if (i == 0 || nota > maiorNota) {
                maiorNota = nota;
            }
        }

        double media = somaTotal / quantidadeAlunos;

        System.out.println("Soma total das notas: " + somaTotal);
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota da turma: " + maiorNota);

        scanner.close();

    }
}