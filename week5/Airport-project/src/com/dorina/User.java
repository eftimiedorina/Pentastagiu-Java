package com.dorina;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String fname;
    private String lname;
    private Date birthDate;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public User(String fname, String lname, String birthDate) {
        this.fname = fname;
        this.lname = lname;
        setBirthDate(birthDate);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        String dateString = format.format(new Date());
        try {
            this.birthDate = (Date)format.parse(birthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "User: " +
                 fname + ' ' +
                lname  +
               '\n';
    }
}
