public class ex12 {
  public static void main(String[] args) {
    for(int j=2; j<=97; j++) {
      for(int i=2; i<j; i++) {

        if(j % i == 0 && j == i) {
          System.out.println("O Numero " + j + " é primo!");
          // break;
        } 
      }
    }
  }
}