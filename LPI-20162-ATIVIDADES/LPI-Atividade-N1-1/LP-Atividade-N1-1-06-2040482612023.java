import java.util.Scanner;

public class LP_Atividade_N1_1_06_2040482612023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome de usuário: ");
        String texto = scanner.nextLine();

        // Explicação: O operador && utiliza avaliação em curto-circuito. Se 'texto != null' for falso,
        // a segunda parte 'texto.length() > 0' nem é executada. Se usássemos o operador '&' simples,
        // o Java obrigatoriamente avaliaria os dois lados; se 'texto' fosse nulo, ao tentar executar
        // 'texto.length()', o sistema lançaria uma NullPointerException.
        // conteudo consultado em:https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html

        if (texto != null && texto.length() > 0) {
            System.out.println("Usuário válido fornecido: " + texto);
        } else {
            System.out.println("Entrada rejeitada: O texto está nulo ou vazio.");
        }

        scanner.close();
