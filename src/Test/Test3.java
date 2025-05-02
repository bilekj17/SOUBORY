package Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Files.newBufferedReader;
import static java.nio.file.Files.newBufferedWriter;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Path vstup = Path.of("rovnice.txt");
        Path vystup = Path.of("spravneRovnice.txt");

        BufferedReader reader = Files.newBufferedReader(vstup);
        BufferedWriter writer = Files.newBufferedWriter(vystup);

        String line;
        while ((line = reader.readLine()) != null) {
            String[] split = line.trim().split("=");
            String vyraz = split[0].trim();
            int ocekavany = Integer.parseInt(split[1].trim());

            if (vyraz.contains("+")) {
                String[] cisla = vyraz.split("\\+");
                int a = Integer.parseInt(cisla[0].trim());
                int b = Integer.parseInt(cisla[1].trim());
                int vysledek = a + b;

                if (vysledek != ocekavany) {
                    System.out.println("chyba: " + vyraz + " = " + ocekavany + " (správně: " + vysledek + ")");
                } else {
                    writer.write(line + "\n");
                }
            } else if (vyraz.contains("-")) {
                String[] cisla = vyraz.split("-");
                int a = Integer.parseInt(cisla[0].trim());
                int b = Integer.parseInt(cisla[1].trim());
                int vysledek = a - b;

                if (vysledek != ocekavany) {
                    System.out.println("chyba: " + vyraz + " = " + ocekavany + " (správně: " + vysledek + ")");
                } else {
                    writer.write(line + "\n");
                }
            } else if (vyraz.contains("*")) {
                String[] cisla = vyraz.split("\\*");
                int a = Integer.parseInt(cisla[0].trim());
                int b = Integer.parseInt(cisla[1].trim());
                int vysledek = a * b;

                if (vysledek != ocekavany) {
                    System.out.println("chyba: " + vyraz + " = " + ocekavany + " (správně: " + vysledek + ")");
                } else {
                    writer.write(line + "\n");
                }
            } else if (vyraz.contains("/")) {
                String[] cisla = vyraz.split("/");
                int a = Integer.parseInt(cisla[0].trim());
                int b = Integer.parseInt(cisla[1].trim());
                if (b == 0) {
                    System.out.println("chyba: dělení nulou ve výrazu: " + line);
                    continue;
                }
                int vysledek = a / b;

                if (vysledek != ocekavany) {
                    System.out.println("chyba: " + vyraz + " = " + ocekavany + " (správně: " + vysledek + ")");
                } else {
                    writer.write(line + "\n");
                }
            } else {
                System.out.println("neznámý operátor v řádku: " + line);
            }
        }

        reader.close();
        writer.close();
    }
}
