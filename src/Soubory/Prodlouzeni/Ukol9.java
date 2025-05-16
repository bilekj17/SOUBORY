package Soubory.Prodlouzeni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class Ukol9 {
    public static void main(String[] args) throws IOException {
        Path vstup = Path.of("binarni.txt");
        Path vystup = Path.of("velkaBinarni.txt");

        BufferedReader reader = newBufferedReader(vstup);
        BufferedWriter writer = newBufferedWriter(vystup);

        reader.lines();
        String line;
        while (reader.ready()) {
            line = reader.readLine();
            int soucet = 0;
            for (int i = 0; i < line.length(); i++) {
                int cifra = Integer.parseInt(line.substring(i, i + 1));
                double mocnina = cifra*Math.pow(2, (line.length()-i));
                soucet += mocnina;

            }
            System.out.println("Binárně: "+line+" -> Desítkově: "+soucet);
            if (soucet >100){
                writer.write(line+" -> "+soucet+"\n");
            }
        }
        reader.close();
        writer.close();
    }
}
