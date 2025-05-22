package Ukol3;

import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean pokracuj = false;
        String[] pole = new String[5];
        Path vstup = Path.of("telesa.txt");
        Path vystup = Path.of("telesa.txt");
        while(true){
            System.out.println("klikni na 1 pro přidání prvku do pole");
            System.out.println("klikni na 2 pro výpis prvků z pole");
            System.out.println("klikni na 3 pro mazání prvků v poli");
            System.out.println("klikni na 4 pro uložení pole do textového souboru (telesa.txt)");
            System.out.println("klikni na 5 pro načtení prvků pole z textového souboru (telesa.txt)do pole");
            System.out.println("klikni na 6 pro ukončení");
            int volba = sc.nextInt();
            sc.nextLine();

            switch (volba){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
    }
}
