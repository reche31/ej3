package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner teclat = new Scanner(System.in);
	    temps[] marca = new temps[10];
	    temps[] resultat = new temps[10];

        for (int i =0;i<marca.length;i++) {
            marca[i] = new temps();

            System.out.println("Escriu el nom del corredor");
            marca[i].nom = teclat.nextLine();
            System.out.println("Tecleja el temps");
            marca[i].temps = teclat.nextFloat();

            System.out.println(marca[i].nom);

        }
    }
}
