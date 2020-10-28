import java.util.Scanner;

public class ex11 {
  public static void main(String[] args) {
    float peso, altura;
    double IMC;

    IMC = 0;
    peso = 0;
    altura = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Insira o seu peso -> ");
    peso = scanner.nextFloat();
    System.out.print("Insira a sua altura -> ");
    altura = scanner.nextFloat();

    IMC = peso/(altura*altura);

    if(IMC<=19) {
      System.out.println("Abaixo do peso normal");
    }
    else if(IMC<=25) {
      System.out.println("Peso normal");
    }

    else if(IMC<=30) {
      System.out.println("Excesso de peso");
    } else {
      System.out.println("Obeso");
    }
  }
}
  

