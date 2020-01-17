package hu.flow;

import java.util.Random;

public class XWing extends RebelShip implements HiperJump {

    public XWing() {
        super(150, true);
    }

    @Override
    public void hiperJump() {
    Random rnd = new Random();
    double increase = rnd.nextDouble()*100;
    this.setSpeed(this.getSpeed() + increase);
    }

    @Override
    public boolean catchedByBeam() {
        if(this.isGoneFail() && this.getSpeed() < 10000) return true;
        return false;
    }

    @Override
    public String toString() {
        return "XWing's speed: " + this.getSpeed() + ", goneWrong: " + this.isGoneFail() + ".";
    }
}

//Írj egy XWing osztályt, ami a LazadoGep leszármazottja, és megvalósítja az Hiperhajto-
//mu interfészt.
//– Az osztálynak egy default konstruktora legyen, ami beállítja az X-Wing tulajdonsága-
//it. Az X-Wing sebessége 150, és meghibásodhat.
//– Ha az X-Wing hiperugrást végez, akkor sebessége egy 0-100 közötti véletlenszerű lebe-
//gőpontos számmal nő.
//– Az X-Wing et akkor kapja el a vonósugár, ha meghibásodhat, és sebessége kisebb,
//mint 10000.
//– Az osztály legyen továbbá szöveges formára alakítható. Az adattagok értékein kívül
//írja ki azt is, hogy egy X-Wingről van szó.