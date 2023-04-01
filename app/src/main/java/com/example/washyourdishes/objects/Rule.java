package com.example.washyourdishes.objects;

public class Rule {
    private final int id;
    private final String activity;
    private int points;
    public Rule(int id, String activity, int points) {
        this.id = id;
        this.activity = activity;
        this.points = points;
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


}
