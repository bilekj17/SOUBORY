import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        File souborProCteni = new File(System.getProperty("user.home"), "soubor.txt");
        File souborProZapis = new File(System.getProperty("user.home"), "vystup.txt");
        souborProCteni.createNewFile();
        souborProZapis.createNewFile();
        System.out.println("Délka souboru: " + souborProCteni.getName() + ", " + souborProCteni.length());
        System.out.println("Je to soubor? " + souborProCteni.isFile());
        FileReader soubor = new FileReader(souborProCteni); //aktivace proudu pro čtení
        FileWriter vystup = new FileWriter(souborProZapis); //aktivace proudu pro zápis
        do {
            int znakCislo = soubor.read(); //čtení jednotlivého znaku a jeho uložení ve formě ASCII hodnoty
            if (znakCislo == -1) // -1 znamena konec souboru
                break;
// System.out.println(znakCislo + " " + (char)znakCislo);
            System.out.print((char) znakCislo); // převod číselné hodnoty z ASCII na odpovídající znak
            vystup.write(znakCislo); //vystup znaku do souboru
            Thread.sleep(250); //vystup znaku na obrazovku po 0,25s
        } while (true);
        soubor.close();
        vystup.close();
    }
}