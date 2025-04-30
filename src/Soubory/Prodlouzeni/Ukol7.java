package Soubory.Prodlouzeni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class Ukol7 {
    public static void main(String[] args) throws IOException {
        Path vstup = Path.of("dveCelaCisla.txt");
        Path vystup = Path.of("rozdilCisel.txt");

        BufferedReader reader = newBufferedReader(vstup);
        BufferedWriter writer = newBufferedWriter(vystup);

        reader.lines();
        String line;
        while (reader.ready()) {
            line = reader.readLine();
            String[] split =  line.trim().split(" ");
            int cislo1 = Integer.parseInt(split[0]);
            int cislo2 = Integer.parseInt(split[1]);

            int rozdil = cislo1-cislo2;

            if (rozdil < 0){
                System.out.println(cislo1+" - "+cislo2+" = "+rozdil);
            }

            writer.write(cislo1+" - "+cislo2+" = "+rozdil+"\n");
        }
        reader.close();
        writer.close();
    }
}
