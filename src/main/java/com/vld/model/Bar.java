package com.vld.vld.model;


import javax.persistence.Column;

public class Bar {
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
}
