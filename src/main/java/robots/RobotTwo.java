package main.java.robots;

public class RobotTwo extends RobotOne {

    protected String bullets;

    public RobotTwo(String name, int version, String bullets) {
        super(name, version);
        this.bullets = bullets;
    }

    private String getBullets() {
        return bullets;
    }

    public void shootByBullets() {
        System.out.println("I will shot with chocolate bullets!!!");
    }

    @Override
    public String toString() {
        return "Robot " + name + ", version " + version + ", can speak, walk and shoot with " + bullets + " bullets";
    }

}


