package com.javaorders.demo.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordnum;

    private double advanceamount;
    private double ordamount;
    private String orderdescription;

    //ManyToOne customer
    @ManyToOne
    @JoinColumn(name = "custcode")
    @JsonIgnoreProperties({"agent", "orders"})
    private Customers customer;

    //ManyToMany payments
    @ManyToMany(mappedBy = "orders")
    private List<Payments> payments = new ArrayList<>();

    public Orders() {
    }

    public Orders(long ordnum, double advanceamount, double ordamount, String orderdescription) {
        this.ordnum = ordnum;
        this.advanceamount = advanceamount;
        this.ordamount = ordamount;
        this.orderdescription = orderdescription;
    }

    public double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount) {
        this.advanceamount = advanceamount;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public String getOrderdescription() {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }

    public long getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(long ordnum) {
        this.ordnum = ordnum;
    }
}
