import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int numeros = 0;
       for(int i = 0; i < 6; i++){
           double numero = s.nextDouble();
           if(numero > 0){
               numeros++;
           }

       }
       System.out.println(numeros + " valores positivos");
    }
        }