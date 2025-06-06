package Soubory.Prodlouzeni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class Ukol12 {
    public static void main(String[] args) throws IOException {
        File vstup = new File("cislaSudLich.txt");
        File vystup1 = new File(" viceSudych.txt");
        File vystup2 = new File(" viceLichych.txt");

        BufferedReader reader = newBufferedReader(vstup.toPath());
        BufferedWriter writer1 = newBufferedWriter(vystup1.toPath());
        BufferedWriter writer2 = newBufferedWriter(vystup2.toPath());

        int cisloRadku = 0;

        reader.lines();

        while (reader.ready()) {
            String line = reader.readLine();
            String[] split = line.split(" ");
            int pocetS = 0;
            int pocetL = 0;
            for (int i = 0; i < split.length; i++) {
                int radek = Integer.parseInt(split[i]);
                if (radek % 2 == 0){
                    pocetS++;
                }else {
                    pocetL++;
                }
            }
            cisloRadku++;
            if (pocetS>pocetL){
                writer1.write("Řádek"+cisloRadku+": "+pocetS+" Sudá čísla, "+pocetL+" Lichá čísla \n");
            }else if(pocetL>pocetS){
                writer2.write("Řádek"+cisloRadku+": "+pocetL+" Lichá čísla, "+pocetS+" Sudá čísla \n");
            }else if(pocetS==pocetL){
                writer1.write("Řádek"+cisloRadku+": "+pocetS+" Sudá čísla, "+pocetL+" Lichá čísla \n");
                writer2.write("Řádek"+cisloRadku+": "+pocetL+" Lichá čísla, "+pocetS+" Sudá čísla \n");
            }
        }
        reader.close();
        writer1.close();
        writer2.close();
    }
}
