package com.Principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    System.out.println("Ingrese su genero(masculino o femenino):");
    String genero = s.nextLine();
    System.out.println("Ingrese su altura(en centimetros):");
    int altura = s.nextInt();
     switch (genero){
         case "masculino":
            int pesoM = altura - 110;
            System.out.println("Su peso ideal es:"+pesoM+"kg");
            break;
         case "femenino":
            int pesoF = altura - 120;
            System.out.println("su peso ideal es: "+pesoF+"kg");
            break;
         default:
             System.out.println("genero incompatible");
     }


    }
}
