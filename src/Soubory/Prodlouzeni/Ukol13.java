package Soubory.Prodlouzeni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class Ukol13 {
    public static void main(String[] args) throws IOException {
        File vstup = new File("rozsahy.txt");
        File vystup = new File("velkeRozdily.txt");

        BufferedReader reader = newBufferedReader(vstup.toPath());
        BufferedWriter writer = newBufferedWriter(vystup.toPath());

        int pocetRadek = 0;

        reader.lines();

        while (reader.ready()) {
            String line = reader.readLine();
            String[] split = line.split(" ");

            int max = Math.max(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
            int pravyMax = Math.max(max, Integer.parseInt(split[2]));
            int min = Math.min(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
            int pravyMin = Math.min(Integer.parseInt(split[2]), min);


            pocetRadek++;

            writer.write("Řádek"+pocetRadek+": min = " + pravyMin + " max = " + pravyMax + "\n");
        }
        reader.close();
        writer.close();
    }
}
