package Soubory;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
//Login email;Identifier;One-time password;Recovery code;First name;Last name;Department;Location

public class Ukol5 {
    public  static void main(String[] args) throws IOException {
        File soubor = new File(System.getProperty("user.dir"),  "neco.csv");
//        for(int znak = fr.read(); znak != -1; znak = fr.read()) {
//        }
        Scanner sc = new Scanner(soubor);
        sc.nextLine();
        int max = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            User5 user = new User5(line);
            System.out.println(user.getOnetimePassword()+" "+user.getLastname());
            if (user.getIdentifier() > max) {
                max = user.getIdentifier();
            }
        }
        String[] strMax = String.valueOf(max).split("");
        int soucet = Integer.parseInt(strMax[0]);
        soucet += Integer.parseInt(strMax[1]);
        soucet += Integer.parseInt(strMax[2]);
        soucet += Integer.parseInt(strMax[3]);
        System.out.println(soucet);
    }
}
