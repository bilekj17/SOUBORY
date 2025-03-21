package Soubory.Prodlouzeni;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Flush {
    public static void main(String[] args) {
        String radek = "Kobyla má malý bok.";
        Path path = Path.of("kamen.txt");
        try (BufferedWriter bufVystup = Files.newBufferedWriter(path)) {
            for (int i = 1; i <= 7500; i++) {
                bufVystup.write(radek);
                bufVystup.newLine();
// Okamžité zapsání aktuálního obsahu bufferu do souboru
                bufVystup.flush();
            }
        } catch (IOException e) {
            System.err.println("Chyba pri praci se souborem.");
        }
    }
}
