package Soubory.Prodlouzeni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class Ukol8 {
    public static void main(String[] args) throws IOException {
        Path vstup = Path.of("mocniny.txt");
        Path vystup = Path.of("vystupMocnin.txt");

        BufferedReader reader = newBufferedReader(vstup);
        BufferedWriter writer = newBufferedWriter(vystup);

        reader.lines();
        String line;
        while (reader.ready()) {
            line = reader.readLine();
            String[] split = line.trim().split(" ");
            int cislo1 = Integer.parseInt(split[0]);
            int cislo2 = Integer.parseInt(split[1]);
            int cislo3 = Integer.parseInt(split[2]);
            double vysledek = Math.pow(cislo1, cislo2);

            if (vysledek != cislo3) {
                System.out.println(cislo1+" ^ "+cislo2+" != "+cislo3);
            }

            writer.write(cislo1+" ^ "+cislo2+" = "+vysledek+"\n");
        }
        reader.close();
        writer.close();
    }
}
