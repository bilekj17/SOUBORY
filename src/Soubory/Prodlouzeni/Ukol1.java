package Soubory.Prodlouzeni;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ukol1 {
    public static void main(String[] args) {
        Path vstupniEmail = Path.of(System.getProperty("user.dir"), "vstupni_email.txt");

        int pocetGmailu = 0;
        try{
            BufferedReader reader = Files.newBufferedReader(vstupniEmail);
            BufferedWriter writer = Files.newBufferedWriter(vstupniEmail);
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.endsWith("@gmail.com")){
                    writer.write(line);
                    writer.newLine();
                    pocetGmailu++;
                }


            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}