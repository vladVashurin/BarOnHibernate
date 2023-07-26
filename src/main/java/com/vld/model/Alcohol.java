package com.vld.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity(name = "alcohol")
//@Table(name = "alcohol")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Alcohol extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "alcohol_type_id")
    private AlcoholType alcoholType;
}
