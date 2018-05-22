package fhi.daubner.cisla;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Cislo {


    public static void main(String[] args) {

        int x;
        int y;

        try (Scanner reader = new Scanner(in)) {
            out.println("Prve cislo:");
            x = reader.nextInt();
            out.println("Druhe cislo:");
            y = reader.nextInt();
        }

        if (x / 10 == y / 10 || x / 10 == y % 10 || x % 10 == y / 10 || x % 10 == y % 10) {
            out.println("True");
        }

         else out.println("False");
    }
}