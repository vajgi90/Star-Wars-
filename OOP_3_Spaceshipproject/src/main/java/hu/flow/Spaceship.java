package hu.flow;

public interface Spaceship {

    public abstract boolean isSpeedUp(Spaceship item);

    public abstract double speedOfSpacheship ();

}
//Írj egy Urhajo interfészt, ami egy legyorsuljaE metódust tartalmaz. A metódus paramé-
//tere egy Urhajo objektum, és egy logikai értékkel tér vissza. Legyen egy milyenGyors
//metódusa is, ami nem kér paramétert, és az Urhajo gyorsaságát fogja visszaadni.