package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Path vstup = Path.of("rovnice.txt");
        Path vystup = Path.of("spravneRovnice.txt");

        BufferedReader reader = Files.newBufferedReader(vstup);
        BufferedWriter writer = Files.newBufferedWriter(vystup);

        String line;
        while ((line = reader.readLine()) != null) {
            String[] split = line.trim().split(" ");
            int cislo1 = Integer.parseInt(split[0]);
            int cislo2 = Integer.parseInt(split[2]);
            int vysledek = Integer.parseInt(split[4]);

            if (split[1].equals("+")){
                int sVysledek = cislo1+cislo2;
                if (sVysledek != vysledek){
                    System.out.println("Výsledek je špatně: "+vysledek+" správný je: "+sVysledek);
                } else{
                    writer.write(line+ "\n");
                }
            }
            if (split[1].equals("-")){
                int sVysledek = cislo1-cislo2;
                if (sVysledek != vysledek){
                    System.out.println("Výsledek je špatně: "+vysledek+" správný je: "+sVysledek);
                } else{
                    writer.write(line+ "\n");
                }
            }
            if (split[1].equals("*")){
                int sVysledek = cislo1*cislo2;
                if (sVysledek != vysledek){
                    System.out.println("Výsledek je špatně: "+vysledek+" správný je: "+sVysledek);
                } else{
                    writer.write(line+ "\n");
                }
            }
            if (split[1].equals("/")){
                int sVysledek = cislo1/cislo2;
                if (sVysledek != vysledek){
                    System.out.println("Výsledek je špatně: "+vysledek+" správný je: "+sVysledek);
                } else{
                    writer.write(line+ "\n");
                }
            }
        }

        reader.close();
        writer.close();
    }
}
