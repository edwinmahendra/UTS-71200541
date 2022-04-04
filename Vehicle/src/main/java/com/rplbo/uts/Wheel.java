package com.rplbo.uts;

public class Wheel {
    private int width;
    private int diameter;

    public Wheel(int width, int diameter){
        this.width = width;
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getwidth() {
        return width;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setwidth(int width) {
        this.width = width;
    }
}
