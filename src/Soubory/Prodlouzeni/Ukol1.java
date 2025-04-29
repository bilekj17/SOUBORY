package Soubory.Prodlouzeni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class Ukol1 {
    public static void main(String[] args) throws IOException {
        Path vstup = Path.of("vstupni_email.txt");
        Path vystup = Path.of("vystupni_email.txt");

        BufferedReader reader = newBufferedReader(vstup);
        BufferedWriter writer = newBufferedWriter(vystup);

        reader.readLine();
        String line;
        int pocetGmailu = 0;
        while (reader.ready()) {
            line = reader.readLine();
            String[] gmailSplit = line.split("@");
            String[] nameSplit = gmailSplit[0].split("\\.");
            if (gmailSplit[1].equals("gmail.com")) {
                writer.write(line+"\n");
                pocetGmailu++;
            }
            System.out.println(nameSplit[0]+" "+nameSplit[1]);
            if (gmailSplit[1].equals("seznam.cz")) {
                System.out.println(line+"\n");
            }
        }
        writer.close();
        reader.close();
        System.out.println("pocet gmailů: "+pocetGmailu);
    }
}