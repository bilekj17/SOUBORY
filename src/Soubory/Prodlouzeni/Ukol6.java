package Soubory.Prodlouzeni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class Ukol6 {
    public  static void main(String[] args) throws IOException {
        Path vstup = Path.of("cislaMax.txt");
        Path vystup = Path.of("vystupCisel.txt");

        BufferedReader reader = newBufferedReader(vstup);
        BufferedWriter writer = newBufferedWriter(vystup);

        int cisloRadku = 1;
        reader.lines();
        String line;
        while (reader.ready()) {
            line = reader.readLine();
            String[] split = line.split(" ");
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < split.length; i++){
                int cisla = Integer.parseInt(split[i]);
                if (cisla>max){
                    max = cisla;
                }
            }
            System.out.println("Největší číslo v řádku "+cisloRadku+": "+max);
            if (max>100){
                writer.write(line+"\n");
            }
            cisloRadku++;
        }
        reader.close();
        writer.close();
    }
}
