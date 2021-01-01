package com.bima.springdatajpa.model;


import javax.persistence.*;
import java.util.Date;

@Entity @Table(name="app_user")
public class AppUser {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(name="username")
    private String username;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="join_date")
    private Date joinDate;

    @Override
    public String toString(){
        return  String.format(""+ "AppUser[id=%d,username=%s,firstName=%s,lastName=%s,joinDate=%tD",
                Id, username, firstName, lastName, joinDate);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
