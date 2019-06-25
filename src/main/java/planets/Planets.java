package main.java.planets;

public enum Planets {

    SEA("But robot have a rescue circle, so I can swim!"),
    WIND("But robot have a propeller, so I can force the wind!"),
    SUN("But robot have a hat and raincoat, so I can lie on the sun!");

    private final String getAdaptaion;

    Planets(String getAdaptaion) {
        this.getAdaptaion = getAdaptaion;
    }

    public String getProtection() {
        return getAdaptaion;
    }
}





