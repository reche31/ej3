package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner teclat = new Scanner(System.in);
	    temps[] marca = new temps[5];

	    int mitjana;
	    int sum=0;

        for (int i =0;i<marca.length;i++) {
            marca[i] = new temps();

            System.out.println("Escriu el nom del corredor");
            marca[i].nom = teclat.nextLine();
            System.out.println("Tecleja el temps");
            marca[i].temps = teclat.nextFloat();

            teclat.nextLine();
        }

        for (int i =0;i<marca.length;i++){
            sum += marca[i].temps;
        }
        mitjana = sum/10;

        for (int i =0;i<marca.length;i++){
            if(marca[i].temps > 15){
                System.out.println("La persona "+marca[i].nom+" ha tardat més de 15 mins min");
            }else if(marca[i].temps < mitjana){
                System.out.println("La persona "+marca[i].nom+" ha estat per sota de la mitjana");
            }else {
                System.out.println("La persona" + marca[i].nom + "A tardat menys de 15 mins i esta per sobra de la mitjana");
            }
        }
    }
}
