package com.mkyong.model;

import javax.persistence.*;

@Entity(name = "PATRON_PROFILE")
public class PatronProfile {


    @Column(name = "EMAILADDRESS")
    String email;

    @Column(name = "FIRSTNAME")
    String firstname;


    @Id
    @Column(name = "PATRONPROFILEID")
    int patronprofileid;

    public PatronProfile(String name, String email, int patronprofileid) {
        this.firstname = name;
        this.email = email;
        this.patronprofileid = patronprofileid;
    }

    public PatronProfile(){

    }

    public String toString(){
        return("FirstName:" + firstname + "Email:" + email);
    }

}
