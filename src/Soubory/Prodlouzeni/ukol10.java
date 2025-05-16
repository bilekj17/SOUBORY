package Soubory.Prodlouzeni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class ukol10 {
    public static void main(String[] args) throws IOException {
        Path vstup = Path.of("hesla.txt");
        Path vystup = Path.of("platnaHesla.txt");

        BufferedReader reader = newBufferedReader(vstup);
        BufferedWriter writer = newBufferedWriter(vystup);

        reader.lines();
        String line;
        while(reader.ready()) {
            line = reader.readLine();
            boolean cislice = false;
            boolean pismeno = false;
            for (int i = 0; i < line.length(); i++) {
                if (Character.isUpperCase(line.charAt(i))) {
                    pismeno = true;
                }
                if (line.charAt(i) != '0' || line.charAt(i) != '1' || line.charAt(i) != '2' || line.charAt(i) != '3' || line.charAt(i) != '4' || line.charAt(i) != '5' || line.charAt(i) != '6' || line.charAt(i) != '7' || line.charAt(i) != '8' || line.charAt(i) != '9') {
                    cislice = true;
                }
            }
            if (line.length()>7 && cislice && pismeno) {
                writer.write("Heslo '"+line+"' platné \n");
            } else {
                System.out.println("Heslo '"+line+"' neplatné");
            }
        }
        writer.close();
        reader.close();
    }
}
