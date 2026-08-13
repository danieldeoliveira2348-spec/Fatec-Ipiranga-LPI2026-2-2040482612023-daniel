import java.util.Scanner;

class LP_Atividade_N1_1_09_2040482612023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota final do aluno: ");
        double notaFinal = scanner.nextDouble();

        String situacaoIfElse;
        if (notaFinal >= 6.0) {
            situacaoIfElse = "Aprovado";
        } else {
            situacaoIfElse = "Reprovado";
        }

        System.out.println("--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");
        System.out.println("Situação (if-else): " + situacaoIfElse);
        System.out.println();

        String situacaoTernario = (notaFinal >= 6.0) ? "Aprovado" : "Reprovado";

        System.out.println("--- Abordagem 2: Operador Ternário Simples ---");
        System.out.println("Situação (Ternário): " + situacaoTernario);

        // Exemplo de Ternário Encadeado (Nested Ternary) caso houvesse um terceiro
        // estado (Exame):
        // String situacaoTresEstados = (notaFinal >= 6.0) ? "Aprovado" : (notaFinal >=
        // 4.0) ? "Exame" : "Reprovado";
        //
        // Por que o ternário encadeado deve ser evitado?
        // Aninhar múltiplos operadores ternários destrói a legibilidade do código,
        // aumentando
        // drasticamente a carga cognitiva para leitura e o risco de introduzir bugs
        // sutis.
        // As boas práticas recomendam utilizar 'if-else' ou 'switch' quando houver mais
        // de duas ramificações.
        // consultado em:https://www.geeksforgeeks.org/java/java-ternary-operator/

        scanner.close();
    }
}