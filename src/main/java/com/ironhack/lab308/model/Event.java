package com.ironhack.lab308.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private Date date;
     private int duration;
     private String location;
     private String title;
     @OneToMany(mappedBy = "event")
     private List<Guest> guestList;


     public Event() {
     }

     public Event(Date date, int duration, String location, String title, List<Guest> guestList) {
          this.date = date;
          this.duration = duration;
          this.location = location;
          this.title = title;
          this.guestList = guestList;
     }
}
