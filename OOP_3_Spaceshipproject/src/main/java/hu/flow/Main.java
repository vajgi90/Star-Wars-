package hu.flow;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

       try {
           StarWars.spaceShips("./ships.txt");
           StarWars.hangar();
       } catch (Exception e) {
           System.out.println("Valami szar van a palacsintában!");
       }
    }
}
