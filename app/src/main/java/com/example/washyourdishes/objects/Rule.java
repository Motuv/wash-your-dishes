package com.example.washyourdishes.objects;

import java.io.Serializable;

public class Rule implements Serializable {
    private final int id;
    private final String activity;
    private int points;

    private static int idCounter = 1;

    public Rule(String activity, int points) {
        this.id = idCounter;
        this.activity = activity;
        this.points = points;
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public String getActivity() {
        return activity;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


    @Override
    public String toString() {
        return "Activity: " + activity + "  [" + points + "] ";
    }
}
