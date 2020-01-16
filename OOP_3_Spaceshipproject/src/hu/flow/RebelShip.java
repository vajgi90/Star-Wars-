package hu.flow;

public abstract class RebelShip implements Spaceship {

    private double speed;
    private boolean goneFail;

    public RebelShip(double speed, boolean goneFail) {
        this.speed = speed;
        this.goneFail = goneFail;
    }

    public abstract boolean catchedByBeam();

    @Override
    public boolean isSpeedUp(Spaceship item) {
        if(item instanceof RebelShip) {
            if(this.getSpeed() > ((RebelShip) item).getSpeed() && ((RebelShip) item).goneFail) return true;
        } else if (item instanceof MilleniumFalcon) {
            if(this.getSpeed() > item.speedOfSpacheship()*2) return true;
        }
        return false;
    }

    @Override
    public double speedOfSpacheship() {
        return this.speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isGoneFail() {
        return goneFail;
    }

    public void setGoneFail(boolean goneFail) {
        this.goneFail = goneFail;
    }

    @Override
    public String toString() {
        return "RebelShip's speed=" + speed + ", goneFail=" + goneFail + ".";
    }
}

//• Írj egy LazadoGep absztrakt osztályt, ami implementálja az Urhajo interfészt.
//– Az osztály a következő private láthatóságú adattagokkal rendelkezik: egy lebegőpon-
//tos sebesség, és egy logikai meghibasodhatE.
//– Az osztály rendelkezzen paraméteres konstruktorral, ami beállítja az adattagokat. Le-
//gyen egy public elkapjaAVonosugar absztrakt metódusa, ami egy logikai értékkel tér
//vissza. Valósítsd meg továbbá az interfész metódusait. A gyorsaság lekérdezésekor
//add vissza a LazadoGep sebességét. Egy LazadoGep egy másik LazadoGep objektu-
//mot akkor tud legyorsulni, ha az meghibásodhat, és a gyorsasága kisebb, mint az övé.
//A MilleniumFalcon objektumot csak akkor tudja legyőzni, ha gyorsasága kétszer na-
//gyobb.
//– Az osztálynak legyen továbbá getter és setter metódusa az adattagjaihoz, és legyen
//szöveges formára alakítható, kiírva az adattagok értékét.