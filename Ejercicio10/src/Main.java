import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int max=100;
        int min=1;
        Random r = new Random();
        int Nrandom= r.nextInt(max)+min;
        System.out.println("Ingrese un numero del 1 al 100");
        Scanner s= new Scanner(System.in);
         int x =s.nextInt();
            if(x>=1 && x <=100){
                while (Nrandom != x){
                    if(x < Nrandom)
                     System.out.println("El numero es mayor");
                    else if (x > Nrandom)
                     System.out.println("el numero es menor");
                     System.out.println("Vuelva a intentar");
                     x = s.nextInt();
                }
            System.out.println("Correcto");
            }else
           System.out.println("el numero debe ser del 1 al 100");
    }
}
