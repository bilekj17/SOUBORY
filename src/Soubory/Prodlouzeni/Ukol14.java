package Soubory.Prodlouzeni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class Ukol14 {
    public static void main(String[] args) throws IOException {
        Path vstup = Path.of("serazeni.txt");
        Path vystup = Path.of("serazeno.txt");

        BufferedReader reader = newBufferedReader(vstup);
        BufferedWriter writer = newBufferedWriter(vystup);

        int pocetRdaek = 0;

        reader.lines();

        while (reader.ready()) {
            String line = reader.readLine();
            String [] split = line.split(" ");

            int[] cislazi = new int[split.length];


            for (int i = 0; i < split.length; i++) {
                cislazi[i] = Integer.parseInt(split[i]);
            }
            Arrays.sort(cislazi);

            String out = Arrays.toString(cislazi);

            pocetRdaek++;

            writer.write("Řádek: "+pocetRdaek+" "+out.substring(1, out.length()-1)+"\n");

            //Arrays.stream(new String[10]).mapToInt(Integer::parseInt).toArray();
        }
        writer.close();
        reader.close();
    }
}
