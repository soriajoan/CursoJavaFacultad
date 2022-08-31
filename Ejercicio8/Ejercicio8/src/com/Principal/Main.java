package com.Principal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        System.out.println("Introduzca un numero");
        double num = lector.nextInt();
        double resultado = Math.sqrt(num);
        System.out.println("La raíz de "+num+" es = "+resultado);
    }
}
