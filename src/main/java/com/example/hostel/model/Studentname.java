package com.example.hostel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student-table")
public class Studentname {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer StudID;
    private String Studentname;
    private String Regno;
    private String email;

    public Integer getStudID() {
        return StudID;
    }

    public void setStudID(Integer studID) {
        StudID = studID;
    }

    public String getStudentname() {
        return Studentname;
    }

    public void setStudentname(String studentname) {
        Studentname = studentname;
    }

    public String getRegno() {
        return Regno;
    }

    public void setRegno(String regno) {
        Regno = regno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
