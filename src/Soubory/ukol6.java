package Soubory;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class ukol6 {
    public static void main(String[] args) throws IOException{
        Path soubor = Path.of(System.getProperty("user.home"), "IdeaProjects", "soubory", "deniro.csv");
        FileReader fr = new FileReader(soubor.toFile());
        String veta = "";
        boolean prvniVeta = true;
        int rok = 2013;
        int score = 0;
        // 10 + 13 znamená ENTER
        do {
            int znak = fr.read();
            if (znak == -1) break;
            if (znak == 10) {
                if (prvniVeta) {
                    prvniVeta = false;
                    System.out.println("zahazuji: " + veta);
                    veta = "";
                } else {
                    String slova[] = veta.trim().split(", ");
                    System.out.println(slova[0].trim() + ", " + slova[1].trim() + ", " + slova[2].trim());
                    if (rok == Integer.valueOf(slova[0].trim()).intValue()) {
                        System.out.println("ROK 2013: ");
                        score += Integer.valueOf(slova[1].trim()).intValue();
                    }
                    veta = "";
                }
            }
            if (znak == 13) {
                System.out.println("TRINACTKA");

            }
            veta += (char) znak;
        }while(true);
        System.out.println("Vysledne score v roce "+rok+"je: "+score);





    }
}
