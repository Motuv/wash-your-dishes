package com.example.washyourdishes;

import com.example.washyourdishes.objects.Event;
import com.example.washyourdishes.objects.User;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class EventGenerator {

    public List<Event> eventsGenerator(){
        Random random = new Random();

        List<Event> Events = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        for(int i=0;i<3;i++) {
            Event e = new Event(new Date(),Globals.users.get(i),Globals.rulesList.get(i), Globals.rulesList.get(i).getId());
            Events.add(e);
        }

        return Events;
    }

}
