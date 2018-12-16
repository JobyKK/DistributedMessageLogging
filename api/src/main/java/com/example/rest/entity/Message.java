package com.example.rest.entity;

import java.util.Date;

public class Message {
    private String text;
    private Date date;

    public Message(String text, Date date) {
        this.text = text;
        this.date = date;
    }
    
    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
}