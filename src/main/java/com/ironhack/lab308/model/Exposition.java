package com.ironhack.lab308.model;

import jakarta.persistence.Entity;

import java.util.Date;
import java.util.List;

@Entity
public class Exposition extends Event{

    private List<Speaker> speakerList;


    public Exposition() {
    }

    public Exposition(Date date, int duration, String location, String title, List<Guest> guestList, List<Speaker> speakerList) {
        super(date, duration, location, title, guestList);
        this.speakerList = speakerList;
    }

    public List<Speaker> getSpeakerList() {
        return speakerList;
    }

    public void setSpeakerList(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }
}
