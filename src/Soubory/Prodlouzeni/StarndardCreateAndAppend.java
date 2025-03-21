package Soubory.Prodlouzeni;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class StarndardCreateAndAppend {
    public static void main(String[] args) {
        String radek = "Kobyla má malý bok.";
        Path path = Path.of("kamen.txt");
// Přidání na konec souboru
        try (BufferedWriter bufVystup = Files.newBufferedWriter(path,
                StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            for (int i = 1; i <= 7500; i++) {
                bufVystup.write(radek);
                bufVystup.newLine();
            }
        } catch (IOException e) {
            System.err.println("Chyba pri praci se souborem.");
        }
    }
}
