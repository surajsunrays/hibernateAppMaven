package com.app.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "emptab1")
public class Employee {
    @Id
    @Column(name = "eid")
    private int eid;
    @Column(name = "ename")
    private String ename;
    @Column(name = "esal")
    private double esal;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "eidfk")
    List<Address> addr = new ArrayList<>(0);

    public Employee() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEsal() {
        return esal;
    }

    public void setEsal(double esal) {
        this.esal = esal;
    }

    public List<Address> getAddr() {
        return addr;
    }

    public void setAddr(List<Address> addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", esal=" + esal +
                ", addr=" + addr +
                '}';
    }
}
