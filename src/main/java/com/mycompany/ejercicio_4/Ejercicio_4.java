
package com.mycompany.ejercicio_4;
import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        int EDALBER,EDANA,EDMAMA;
        System.out.println("ingrese la edad de Juan");
        Scanner entrada = new Scanner(System.in);
        int EDJUAN = entrada.nextInt();
        
        EDALBER=2* EDJUAN/3;
        EDANA=4* EDJUAN/3;
        EDMAMA= EDJUAN+ EDALBER+ EDANA;
        System.out.println("Las edades son: Aberto=" + EDALBER);
        System.out.println("Juan=" + EDJUAN);
        System.out.println("Ana=" + EDANA);
        System.out.println("Mamá=" + EDMAMA);
       
    }
}
