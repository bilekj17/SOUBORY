package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        Path grades = Path.of(System.getProperty("user.dir"), "grades.csv");
        Path output = Path.of(System.getProperty("user.dir"), "output.txt");
        Path graf = Path.of(System.getProperty("user.dir"), "graf.txt");

        BufferedReader reader = newBufferedReader(grades);
        BufferedWriter writerOut = newBufferedWriter(output);
        BufferedWriter writerGraf = newBufferedWriter(graf);

        reader.readLine();

        Zak[] nej =  new Zak[4];
        int[] pocetZnamek = new int[]{0,0,0,0,0,0};

        String line;
        while (reader.ready()) {
            line = reader.readLine();
            Zak zak = new Zak(line);


            if (zak.getCleanGrade().equals("A") || zak.getCleanGrade().equals("B")) {
                writerOut.write(zak.toString()+"\n");
            }

            for (int i = 0; i < 4; i++) {
                if (nej[i] == null) {
                    nej[i] = zak;
                } else if (zak.getZnamky()[i] > nej[i].getZnamky()[i]) {
                    nej[i] = zak;
                }
            }

            pocetZnamek[zak.getNumberGrade()-1]++;
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(nej[i].getName()+" byl nejlepší na "+(i+1)+". testu");
        }


        int height = Arrays.stream(pocetZnamek).max().getAsInt();
        for (int i = height-1; i >= 0; i--) {
            StringBuilder radek = new StringBuilder("           ");
            for (int j = 0; j < 6; j++) {
                if (pocetZnamek[j] > i) {
                    radek.setCharAt(j*2,'+');
                }
            }

            writerGraf.write(radek.toString()+"\n");
        }
        writerGraf.write("A B C D E F\n");


        reader.close();
        writerOut.close();
        writerGraf.close();
    }
}
