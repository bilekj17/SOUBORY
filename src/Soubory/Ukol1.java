package Soubory;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ukol1 {
    public static void main(String[] args) throws IOException {
        File soubor = new File(System.getProperty("user.home"), "vstup.txt");
        File soubor1 = new File(System.getProperty("user.home"), "vystup.txt");
        soubor1.createNewFile();
        FileReader fr = new FileReader(soubor);
        FileWriter fw = new FileWriter(soubor1);

        while (fr.ready()) {
            char c = (char)fr.read();
            fw.write(c);
            System.out.print(c);
            if (c == '.' || c == '!' || c == '?') {
                fw.write("\n");//odřádkování
                System.out.println();
            }


        }
        fr.close();
        fw.close();





    }
}
