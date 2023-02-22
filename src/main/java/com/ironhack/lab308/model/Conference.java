package com.ironhack.lab308.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Conference extends Event{

    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakerList;

    public Conference() {

    }

    public Conference(Date date, int duration, String location, String title, List<Guest> guestList) {
        super(date, duration, location, title, guestList);
    }

    public Conference(Date date, int duration, String location, String title, List<Guest> guestList, List<Speaker> speakerList) {
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
