import java.util.Scanner;

public class LP_Atividade_N1_1_01_2040482612023{
    public static void main(String[] args){
    byte idade;
    short faltas;
    int matriculaID;
    long codigoNacional;
    float notaTrabalho;
    double notaProvaFinal;
    char conceitoFinal;
    boolean aprovado;

    Scanner leitorRespostas = new Scanner(System.in);

    System.out.print("Idade do Aluno: ");
    idade = Byte.parseByte(leitorRespostas.nextLine());
    // byte tem 8 bits | -32.768 a 32.767 de intervalo.

    System.out.print("Número de Faltas: ");
    faltas = Short.parseShort(leitorRespostas.nextLine());
    // short tem 16 bits |  -32.768 a 32.767 de intervalo.
    

    System.out.print("Matrícula ID: ");
    matriculaID = Integer.parseInt(leitorRespostas.nextLine());
    // int tem  32 bits | -2.147.483.648 a 2.147.483.647 de intevalo.

    System.out.print("Código Nacional do Estudante: ");
    codigoNacional = Long.parseLong(leitorRespostas.nextLine());
    // long tem 64 bits | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 de intervalo.
   

    System.out.print("Nota do Trabalho: ");
    notaTrabalho = Float.parseFloat(leitorRespostas.nextLine());
    // float: 32 bits | ~ 1.4e-45 a 3.4e+38.
    

    System.out.print("Nota da Prova Final: ");
    notaProvaFinal = Double.parseDouble(leitorRespostas.nextLine());
    // double tem  64 bits | 4.9e-324 a 1.7e+308 de intevalo.

    System.out.print("Conceito Final do Aluno: ");
    conceitoFinal = leitorRespostas.nextLine().charAt(0);
    // char tem 16 bits | 0 a 65.535 (caractere Unicode) de intevalo.

    System.out.print("Aluno Está Aprovado (true/false): ");
    aprovado = Boolean.parseBoolean(leitorRespostas.nextLine());
    // boolean tem  1 bit lógico | true ou false.

    // os valores foram extraidos apartir dos comandos: tipoPrimitivo.size, tipoPrimitivo.MIN_VALUE e tipoPrimitivo.MAX_VALUE.
    

    System.out.println("Idade do Aluno: " + idade);
    System.out.println("Número de Faltas: " + faltas);
    System.out.println("Matrícula ID: " + matriculaID);
    System.out.println("Código Nacional do Estudante: " + codigoNacional);
    System.out.println("Nota do Trabalho: " + notaTrabalho);
    System.out.println("Nota da Prova Final: " + notaProvaFinal);
    System.out.println("Conceito Final do Aluno: " + conceitoFinal); 
    System.out.println("Aluno Está Aprovado (true/false): " + aprovado);

    leitorRespostas.close();
}
}