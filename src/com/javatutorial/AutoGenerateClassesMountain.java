package com.javatutorial;

public class AutoGenerateClassesMountain {
    private int mtHeightMeters;
    private int mtWidthMeters;
    private String mtName;

    public AutoGenerateClassesMountain(int mtHeightMeters, int mtWidthMeters, String mtName) {
        this.mtHeightMeters = mtHeightMeters;
        this.mtWidthMeters = mtWidthMeters;
        this.mtName = mtName;
    }

    public AutoGenerateClassesMountain() {
        mtHeightMeters = 29_000;
        mtWidthMeters = 5_000;
        mtName = "Mt. Everest";
    }

    @Override
    public String toString() {
        return "Mountain {" +
                "Height=" + mtHeightMeters +
                ", Width=" + mtWidthMeters +
                ", Name='" + mtName + '\'' +
                '}';
    }
}
