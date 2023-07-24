package com.vld.vld.model;



import javax.persistence.*;

@Entity
@Table(name = "alcohol")

public class Alcohol{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

    public Alcohol() {
    }

    public Alcohol(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
