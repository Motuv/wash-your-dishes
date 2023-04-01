package com.example.washyourdishes;

import com.example.washyourdishes.objects.Event;
import com.example.washyourdishes.objects.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class EventGenerator {

    public List<Event> eventsGenerator(){
        Random random = new Random();

        List<Event> Events = new ArrayList<>();
        Event e = new Event(random.nextInt(4000),new Date(),new User(random.nextInt(4000),"Pieter"), random.nextInt(400));
        for(int i=0;i<10;i++)
            Events.add(e);

        return Events;
    }

}
