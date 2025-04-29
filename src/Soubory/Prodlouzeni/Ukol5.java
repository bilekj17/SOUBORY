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
            String[] lineSplit = line.trim().split(",");

            StringBuilder vystup = new StringBuilder();
            int soucet = 0;
            for (int i = 0; i<lineSplit.length; i++){
                soucet += Integer.parseInt(lineSplit[i]);
                vystup.append(lineSplit[i]);
                if (i < lineSplit.length-1){
                    vystup.append("+");
                }
            }
            vystup.append("=").append(soucet);
            System.out.println(vystup);

            if (soucet>50){
                writer.write(String.valueOf(vystup));
                writer.newLine();
            }

        }
        reader.close();
        writer.close();
    }
}
