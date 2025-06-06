package Soubory.Prodlouzeni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class Ukol11 {
    public static void main(String[] args) throws IOException {
        File vstup = new File("posloupnosti.txt");
        File vystup1 = new File("aritmeticke.txt");
        File vystup2 = new File("ciselneRady.txt");

        BufferedReader reader = newBufferedReader(vstup.toPath());
        BufferedWriter writer1 = newBufferedWriter(vystup1.toPath());
        BufferedWriter writer2 = newBufferedWriter(vystup2.toPath());

        reader.lines();
        while (reader.ready()) {
            String line = reader.readLine();
            String[] split = line.trim().split(" ");
            int cislo1 = Integer.parseInt(split[0]);
            int cislo2 = Integer.parseInt(split[1]);
            int cislo3 = Integer.parseInt(split[2]);
            int rozdil1 = cislo1-cislo2;
            int rozdil2 = cislo2-cislo3;

            if (rozdil1 == rozdil2){
                writer1.write(line+"\n");
            }else{
                writer2.write(line+"\n");
            }
        }
        reader.close();
        writer1.close();
        writer2.close();
    }
}
