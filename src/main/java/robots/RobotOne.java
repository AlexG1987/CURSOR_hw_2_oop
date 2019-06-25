package main.java.robots;

import main.java.planets.Planets;

import java.util.Random;

public class RobotOne {

    protected String name;
    protected int version;

    public RobotOne(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public static void speak() {
        System.out.println("Hi friends, let's play!");
    }

    public static void drive() {
        System.out.println("Look, i can drive, it'a awesome!");
    }

    public static void shoot() {
        System.out.println("Now i will shoot!");
    }

    @Override
    public String toString() {
        return "Robot " + name + ", version " + version + ", can speak, walk and shoot!";
    }

    public void adaptToPlanet() {
        Random r = new Random();
        char planet = (char) (r.nextInt(3) + 'A');
        if (planet == 'A') {
            Planets planet1 = Planets.SEA;
            System.out.println(planet1.getProtection());
        } else if (planet == 'B') {
            Planets planet2 = Planets.WIND;
            System.out.println(planet2.getProtection());
        } else {
            Planets planet3 = Planets.SUN;
            System.out.println(planet3.getProtection());
        }
    }

}

