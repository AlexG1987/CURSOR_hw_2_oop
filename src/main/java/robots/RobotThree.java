package main.java.robots;

public class RobotThree extends RobotTwo {

    private int bubblesAmount;

    public RobotThree(String name, int version, String Bullets, int bubblesAmount) {
        super(name, version, Bullets);
        this.bubblesAmount = bubblesAmount;
    }

    protected int getBubblesAmount() {
        return bubblesAmount;
    }

    public void shootByBubbleBullets() {
        System.out.println("I will shoot with chocolate bubbles!!!");
    }

    @Override
    public String toString() {
        return "Robot " + name + ", version " + version + ", can speak, walk and shoot with " + bullets + " bubbles in amount of " + bubblesAmount;
    }

}
