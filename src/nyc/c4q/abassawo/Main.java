package nyc.c4q.abassawo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Que; age avez vous?");

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int ticketPrice;

        if (age <= 13) {
            ticketPrice = 8;
        } else
        if (age <= 64) {
            ticketPrice = 13;
        } else {
            ticketPrice = 10;
        }
        System.out.println("Vous payez: " + ticketPrice + "euros.");

    }
}
