package com.example.washyourdishes.objects;

public class User {
    int id;
    String userName;
    int points;
    Role role;
    String photo;
    int roomId;

    public User(int id, String userName) {
        this.id =id;
        this.userName = userName;
        this.points = 0;
        this.photo="";
        this.roomId = 1;
        this.role = Role.CASUAL;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
