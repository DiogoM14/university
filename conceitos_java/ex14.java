import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class ex14 {
  public static void main(String[] args) {
    int opcao;
    int[] bilhetes = {2499212, 1913312, 2046383, 2046383, 2046383}, nascimento = {2000, 1999, 1999, 1999, 1990, 1990};
    String[] genero = {"masculino", "feminino", "feminino"};
    double[] alcool = {0.3, 0.6, 0.7, 0.3, 0.3};

    Scanner scanner = new Scanner(System.in);

    System.out.println("Selecione uma as opções abaixo:");
    System.out.println("0 - Adicionar dados.");
    System.out.println("1 - Percentagem de condutores com menos de 30 anos.");
    System.out.println("2 - Percentagem de mulheres.");
    System.out.println("3 - Percentagem de condutores masculinos com álcool no sangue superior a 0.5g.");
    System.out.println("4 - A entrada de dados deve terminar quando for lido o valor 0 para o bilhete de identidade.");
    System.out.print("Introduza o número -> ");
    opcao = scanner.nextInt();

    Calendar cal = Calendar.getInstance();
    int year = (cal.get(Calendar.YEAR)-30);

    switch(opcao){
      case 0:
        
        break;
      case 1:
        int arrayLengthNascimento = nascimento.length;
        nascimento = Arrays.stream(nascimento).filter(x -> x <= year).toArray();
        int arrayFilteredLengthNascimento = nascimento.length;

        int percNascimento = (100*arrayFilteredLengthNascimento)/arrayLengthNascimento;

        System.out.println("A percentagem de condutores com menos de 30 anos é de " + percNascimento + "%" );
        break;

      case 2:
        int arrayLengthGenero = genero.length;
        genero = Arrays.stream(genero).filter(s -> s == "feminino").toArray(String[]::new);
        int arrayFilteredLengthGenero = genero.length;

        int percGenero = (100*arrayFilteredLengthGenero)/arrayLengthGenero;

        System.out.println("A percentagem de mulheres é de " + percGenero + "%" );
        break;

        case 3:
          int arrayLengthAlcool = alcool.length;
          alcool = Arrays.stream(alcool).filter(x -> x < 0.5).toArray();
          int arrayFilteredLengthAlcool = alcool.length;

          int percAlcool = (100*arrayFilteredLengthAlcool)/arrayLengthAlcool;

          System.out.println("Percentagem de condutores masculinos com álcool no sangue superior a 0.5g é de " + percAlcool + "%" );
          break;

      default:
        System.out.println("Erro: Introduza um os números a cima!" );
    }


    // System.out.println(genero[0]);
  }
}

/*
número de bilhete de identidade, ano de nascimento, genero e quantidade de álcool no sangue

a. Percentagem de condutores com menos de 30 anos.
b. Percentagem de mulheres.
c. Percentagem de condutores masculinos com álcool no sangue
superior a 0.5g.
d. A entrada de dados deve terminar quando for lido o valor 0 para o bilhete de identidade.
*/