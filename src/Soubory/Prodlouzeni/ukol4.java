package Soubory.Prodlouzeni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Watchable;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class ukol4 {
    public static void main(String[] args) throws IOException {
        Path vstupNasobeni = Path.of("nasobilka.txt");
        Path vystupNasobeni = Path.of("OpravaNasobilky.txt");

        BufferedReader reader = newBufferedReader(vstupNasobeni);
        BufferedWriter writer = newBufferedWriter(vystupNasobeni);

        reader.readLine();

        String line;
        while (reader.ready()) {
            line = reader.readLine();
            String[] split = line.split(",");
            int cislo1 = Integer.parseInt(split[0]);
            int cislo2 = Integer.parseInt(split[1]);
            int cislo3 = Integer.parseInt(split[2]);


            int vysledek = cislo1*cislo2;
            if (vysledek != cislo3){
                vysledek = cislo1*cislo2;
                String zapis = cislo1+", "+cislo2+", "+vysledek+"\n";
                System.out.print(zapis);
                writer.write(zapis);
            }
        }
        writer.close();
        reader.close();
    }
}
