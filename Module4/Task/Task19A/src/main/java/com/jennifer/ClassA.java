package com.jennifer;

public class ClassA {
    // Declare a final variable to make it immutable
    private final int ballSize;

    // Other variables
    private String ballColour;
    private String ballTexture;

    // Constructor to initialize the variables
    public ClassA(int ballSize, String ballColour, String ballTexture) {
        this.ballSize = ballSize;
        this.ballColour = ballColour;
        this.ballTexture = ballTexture;
    }

    // Getter methods for other variables
    public String getBallColour() {
        return ballColour;
    }

    public String getBallTexture() {
        return ballTexture;
    }

    // Setter methods for other variables (if needed)
    public void setBallColour(String ballColour) {
        this.ballColour = ballColour;
    }

    public void setBallTexture(String ballTexture) {
        this.ballTexture = ballTexture;
    }

    // Getter method for ballSize (no setter, as it's final)
    public int getBallSize() {
        return ballSize;
    }
}

