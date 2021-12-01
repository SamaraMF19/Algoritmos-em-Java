import java.util.Scanner;
import java.lang.System;

class Main {
  public static void main(String[] args) {
    String xNome;
    int i;
    float xNota, xSoma, xMedia;

    Scanner entrada = new Scanner(System.in); 

    xSoma = 0;
    xMedia = 0;
    xNota = 0;

     System.out.print("Digite o nome do aluno: ");
     xNome = entrada.nextLine(); 

    for (i=1; i <= 3; i++)
    {
        System.out.print("Digite a nota " + i + " do(a) aluno(a): ");
        xNota = entrada.nextFloat();
        xSoma = xSoma + xNota;
    }

    xMedia = xSoma/(float)3.0;

    if (xMedia >= 10){
    System.out.print("Média das notas do aluno " +xNome+ " é " + xMedia + ". Aluno(a) aprovado(a)!");
    }
    else{
        System.out.print("Média das notas do aluno " +xNome+ " é " + xMedia + ". Aluno(a) reprovado(a)!");
    }

    entrada.close();

  }


}