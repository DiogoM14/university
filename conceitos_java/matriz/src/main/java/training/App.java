package training;

import java.util.Scanner;

public class App 
{
    static int numeros[][] = new int[3][3];
    
    public static void main( String[] args )
    {
        // int opcao=0;
        // Scanner scanner = new Scanner(System.in); 
        
        // do {
            //     System.out.println("1 - Inicializa Array");
            //     System.out.println("2 - Lê Array");
            //     System.out.println("3 - Imprime Array");
            //     System.out.println("4 - Procura Array");
            //     System.out.println("5 - Ordena Array");
            //     System.out.println("0 - Terminar");
            //     System.out.print("\n Introduza a sua opção -> ");
            //     opcao=scanner.nextInt();
            
            // } while(opcao!=0);
            
            // switch(opcao) {
                //     case 1:
                //         inicializa();
                //         break;
                //     case 2:
                //         leitura();
                //         break;
                //     case 3:
                //         imprime();
                //         break;
                //     case 4:
                //         procura();
                //         break;
                //     case 5:
                //         ordenar();
                //         break;
                // }
                
                inicializa();
                // imprime();
                leitura();
                imprime();
                // procura();
                // ordenar();
                // repetido();
            }
            
            public static void inicializa() {   // Inicializa todos os elementos do array até 1
                int i, j;
                
                for(i = 0; i < 3; i++)
                    for(j = 0; j < 3; j++)
                        numeros[i][j] = -1;
            }
            
            public static void imprime() {
                int i, j;
                int[] x, y;
                for(i=0;i<3;i++) 
                    for(j=0; j<3; j++) {
                        x=numeros[i];
                        y=numeros[j];
                        System.out.println("Valor da posição" + i + " -> " + x[i]);
                        System.out.println("Valor da posição" + j + " -> " + y[j]);
                    }
            }
            
            public static void procura() {
                int indexX, indexY, i, j;
                int[] numero;
                
                Scanner scanner = new Scanner(System.in);
                
                System.out.println("Introduza um número a pesquisar -> ");
                numero=scanner.nextInt();
                
                indexX=-1;
                indexY=-1;
                i=0;
                j=0;
                
                while(indexX==-1 && i<numeros.length) {
                    if(numeros[i]==numero)
                    indexX=i;
                    i++;
                }     

                while(indexY==-1 && j<numeros.length) {
                    if(numeros[j]==numero)
                    indexY=j;
                    i++;
                }
                if(indexX==-1)
                System.out.println("Não existe!");
                else    
                System.out.println("O numero " + numero + " existe na posição " + i);
            }
            
            public static void ordenar() {
                int i, j, aux;
                
                for(i=0;i<numeros.length;i++) {
                    for(j=0;j<numeros.length;j++) {
                        if(numeros[j]<numeros[i]){
                            aux=numeros[i];
                            numeros[i]=numeros[j];
                            numeros[j]=aux;
                        }
                    }
                }
            }
            
            public static void leitura() {
                Scanner scanner = new Scanner(System.in);
                
                int i, j;
                int[] x, y;
                
                for(i=0; i<3;i++) {
                    for(j=0; j<3;i++) {
                        y=numeros[j];
                        System.out.println("Valor da posição" + i + " -> " + x[i]);
                        x[i]=scanner.nextInt();
                        System.out.println("Valor da posição" + j + " -> " + y[j]);
                        y[j]=scanner.nextInt();
                    }
                }
            }
            
            public static void repetido() {
                int i;
                
                for(i = 1; i<numeros.length; i++) {
                    if(numeros[i] == numeros[i-1]) {
                        System.out.println("O numero " + numeros[i] + " está repetido");
                    }
                }
            }
        }
        