package Soubory.Prodlouzeni;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ZapisPoRadcich {
    public static void main(String[] args) {
        String radek = "Kobyla má malý bok.";
        Path path = Path.of("kamen.txt");
// Použití try-with-resources pro automatické zavření writeru
        try (BufferedWriter bufVystup = Files.newBufferedWriter(path)) {
            for (int i = 1; i <= 7500; i++) {
// Zápis řetězce radek do souboru po celých řádcích
                bufVystup.write(radek);
// Po uložení každého řádku odřádkujeme a připravíme pro zápis dalšího řádku
                bufVystup.newLine();
            }
        } catch (IOException e) {
            System.err.println("Chyba pri praci se souborem.");
        }
    }
}
