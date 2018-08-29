package com.app.model;

import javax.persistence.*;

@Entity
@Table(name = "addrtab1")
public class Address {
    @Id
    @Column(name = "aid")
    private int aid;
    @Column(name = "loc")
    private String loc;
    @Column(name = "pin")
    private int pin;

    @OneToOne
    @JoinColumn(name = "eidfk")
    private Employee e;

    public Address() {
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Employee getE() {
        return e;
    }

    public void setE(Employee e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", loc='" + loc + '\'' +
                ", pin=" + pin +
                ", e=" + e +
                '}';
    }
}
