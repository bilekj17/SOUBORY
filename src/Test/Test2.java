package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Path vstup = Path.of("znamky.txt");
        Path vystup = Path.of("slabiZaci.txt");

        BufferedReader reader = newBufferedReader(vstup);
        BufferedWriter writer = newBufferedWriter(vystup);

        reader.readLine();
        String line;
        while (reader.ready()){
            line = reader.readLine();
            String[] firstSplit = line.split(":");
            String[] secondSplit = firstSplit[1].trim().split(" ");

            int soucet = 0;
            for (int i = 0; i < secondSplit.length; i++){
                soucet += Integer.parseInt(secondSplit[i]);
            }
            int prumer = soucet/ secondSplit.length;
            if (prumer > 3){
                writer.write(firstSplit[0]+": "+firstSplit[1]+" -> "+prumer);
            }
            System.out.println(firstSplit[0]+": "+firstSplit[1]+" -> "+prumer);
        }
        writer.close();
        reader.close();
    }
}
