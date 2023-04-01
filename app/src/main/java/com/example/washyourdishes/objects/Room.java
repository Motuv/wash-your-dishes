package com.example.washyourdishes.objects;

public class Room {
    int id;
    String name;

    public Room(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
