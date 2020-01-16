package hu.flow;

public class MilleniumFalcon implements HiperJump, Spaceship {

    private double experience;

    public MilleniumFalcon() {
        this.experience = 100;
    }

    @Override
    public void hiperJump() {
        this.setExperience(this.getExperience() + 500);
    }

    @Override
    public boolean isSpeedUp(Spaceship item) {
        if (item instanceof RebelShip) {
            if (this.speedOfSpacheship() > ((RebelShip) item).getSpeed()) return true;
        }
        if (item instanceof XWing) {
            if (this.speedOfSpacheship() > ((XWing) item).getSpeed()) return true;
        }
        return false;
    }

        @Override
        public double speedOfSpacheship () {
            return 2 * this.experience;
        }

        public double getExperience () {
            return experience;
        }

        public void setExperience ( double experience){
            this.experience = experience;
        }

    @Override
    public String toString() {
        return "MilleniumFalcon's experience: " + experience + ".";
    }
}

//• Írj egy MilleniumFalcon osztályt, ami implementálja az Urhajo és Hiperhajtomu interfé-
//szeket.
//– Az osztálynak legyen egy lebegőpontos tapasztalat adattagja.
//– Az osztály rendelkezzen egy default konstruktorral, ami 100-ra állítja az adattag ér-
//tékét. A metódusai az alábbiak szerint legyenek megvalósítva: a Millenium Falcon
//gyorsasága a tapasztalatának kétszeresével egyezik meg, és bármilyen Urhajo-t ké-
//pes legyorsulni, akinek gyorsasága kisebb, mint a Falcon gyorsasága. Ha a Millenium
//Falcon hiperugrást végez, akkor tapasztalata 500-al nő.
//– Az osztály legyen szöveges formára alakítható, ami kiírja, hogy a Millenium Falconról
//van szó, és megadja a tapasztalatát.
