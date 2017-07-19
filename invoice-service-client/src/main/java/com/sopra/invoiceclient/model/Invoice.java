package com.sopra.invoiceclient.model;

import java.util.Date;

public class Invoice {
    private int id;
    private Date date;

    public Invoice() {

    }

    public Invoice(int id, Date date) {
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
