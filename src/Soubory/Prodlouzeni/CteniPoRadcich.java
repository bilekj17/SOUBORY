package Soubory.Prodlouzeni;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CteniPoRadcich {
    public static void main(String[] args) {
        Path path = Path.of("soubor.txt");
//Použití try-with-resources, automaticky zavírá zdroje po použití
        try (BufferedReader bufVstup = Files.newBufferedReader(path)) {
            String radek;
// Čtení cyklem while
// Do proměnné řádek ukládáme celý řádek ze vstupního souboru
            while ((radek = bufVstup.readLine()) != null) {
                System.out.println(radek);
            }
        } catch (IOException e) {
            System.err.println("Chyba pri praci se souborem.");
        }
    }
}
