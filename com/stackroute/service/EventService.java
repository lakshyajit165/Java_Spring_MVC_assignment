package com.stackroute.service;

import com.stackroute.Event;

import java.util.ArrayList;
import java.util.List;

public class EventService {

    static List<Event> events = new ArrayList<>();

    public void addEvent(Event e){
        events.add(e);
    }

    public List<Event> getEvents(){
        System.out.println(events);
        return events;
    }
}
