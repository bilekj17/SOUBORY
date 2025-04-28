package Soubory.Prodlouzeni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class Ukol5 {
    public static void main(String[] args) throws IOException {
        Path vstupSoucty = Path.of("soucty.txt");
        Path vystupSoucty = Path.of("vystupSouctu.txt");

        BufferedReader reader = newBufferedReader(vstupSoucty);
        BufferedWriter writer = newBufferedWriter(vystupSoucty);

        reader.lines();
        String line;
        while (reader.ready()) {
            line = reader.readLine();
            String[] lineSplit = line.split(", ");
            List<Integer>  cisla = new ArrayList<>();
            int soucet = 0;
            for (String s : lineSplit) {
                s = s.trim();
                if (!s.isEmpty()) {
                        int cislo = Integer.parseInt(s);
                        cisla.add(cislo);
                        soucet += cislo;
                }
            }

            StringBuilder vystup = new StringBuilder();
            for (int i = 0; i < cisla.size(); i++) {
                vystup.append(cisla.get(i));
                if (i < cisla.size() - 1) {
                    vystup.append("+");
                }
            }
            vystup.append("=").append(soucet);
            System.out.println(vystup);

            if (soucet<50){
                writer.write(vystup.toString());
                writer.newLine();
            }

        }
    }
}
