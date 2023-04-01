package com.example.washyourdishes.objects;

import java.util.Date;

public class Event {
    private int idEvent;
    private Date date;
    private User user;
    private Rule rule;

    private int idRule;


    public Event(int idEvent, Date date, User user, Rule rule, int idRule) {
        this.idEvent = idEvent;
        this.date = date;
        this.user = user;
        this.rule = rule;
        this.idRule = idRule;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
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



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getIdRule() {
        return idRule;
    }

    public void setIdRule(int idRule) {
        this.idRule = idRule;
    }
}
