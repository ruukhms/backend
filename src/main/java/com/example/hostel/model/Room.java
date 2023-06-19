package com.example.hostel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "room-table")

public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String roomID;


}










