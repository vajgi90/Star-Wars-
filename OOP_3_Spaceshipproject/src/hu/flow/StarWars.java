package hu.flow;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StarWars {

    public static List<HiperJump> list = new ArrayList<>();

    public static void spaceShips(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        while (line != null) {
            String[] words = line.split(" ");
            if (words[0].equals("XWing")) {
                XWing a = new XWing();
                for (int i = 0; i < Integer.parseInt(words[1]); i++) {
                    a.hiperJump();
                }
                list.add(a);
            } else if (words[0].equals("MilleniumFalcon")) {
                MilleniumFalcon a = new MilleniumFalcon();
                for (int i = 0; i < Integer.parseInt(words[1]); i++) {
                    a.hiperJump();
                }
                list.add(a);
            } else {
                System.out.println("Bad row!");
            }
            line = br.readLine();
        }
        br.close();
    }

    public static void hangar() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}




//Írj egy StarWars nevű futtatható osztályt. Az osztály rendelkezzen egy urhajok stati-
//kus függvénnyel, ami egy fájl elérési útját várja paraméterül, visszatérése pedig void. A
//metódus feladata, hogy a fájlból beolvasott sorokat feldolgozza, és létrehozzon belőlük
//XWing, vagy MilleniumFalcon objektumpéldányokat, majd ezekre meghívja a hiperUg-
//ras metódust annyiszor, ahányszor az aktuális sor írja. Ezeket egy közös kollekcióban
//tárold le. Készíts továbbá egy hangar statikus metódust, ami végigmegy a tárolóban
//tárolt objektumokon, és kiírja őket. Hívd meg a main függvényben sorban a fenti két
//metódust. Minden esetleges kivételt (főleg: IOException) kezelj le vagy kivétel specifiká-
//cióval, vagy try blokkban!
//Egy minta fájl felépítése az alábbi:
//XWing 4
//MilleniumFalcon 18