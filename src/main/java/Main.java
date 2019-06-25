package main.java;

import main.java.robots.RobotOne;
import main.java.robots.RobotThree;
import main.java.robots.RobotTwo;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(12) + 1;
        if (number <= 3) {
            RobotOne r1 = new RobotOne("mrRobot", 1);
            System.out.println(r1.toString());
            r1.speak();
            r1.drive();
            r1.shoot();
            System.out.println("Oh no, I was kidnapped by aliens!!!");
            r1.adaptToPlanet();
        } else if (number <= 8) {
            RobotTwo r2 = new RobotTwo("Chocolator ", 2, "Chocolate");
            System.out.println(r2.toString());
            r2.speak();
            r2.drive();
            r2.shootByBullets();
            System.out.println("Oh no, I was kidnapped by aliens!!!");
            r2.adaptToPlanet();
        } else {
            RobotThree r3 = new RobotThree("Bubble chocolator", 3, "Chocolate", 1000);
            System.out.println(r3.toString());
            r3.speak();
            r3.drive();
            r3.shootByBubbleBullets();
            System.out.println("Oh no, I was kidnapped by aliens!!!");
            r3.adaptToPlanet();
        }
    }
}