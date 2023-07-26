package com.vld.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "bars")
//@Table(name = "bars")
public class Bar extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Alcohol> alcoholList;
}
