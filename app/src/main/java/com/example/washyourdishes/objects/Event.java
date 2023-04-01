package com.example.washyourdishes.objects;

import java.util.Date;

public class Event {
    private int idEvent;
    private Date date;
    private User user;
    private int idRules;

    public Event(int idEvent, Date date, User user, int idRules) {
        this.idEvent = idEvent;
        this.date = date;
        this.user = user;
        this.idRules = idRules;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdRules() {
        return idRules;
    }

    public void setIdRules(int idRules) {
        this.idRules = idRules;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
