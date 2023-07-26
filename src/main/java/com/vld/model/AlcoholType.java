package com.vld.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Table(name = "alcohol_types")
@Entity(name = "alcohol_types")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AlcoholType extends AbstractEntity {

    @Column(name = "strength")
    private Double strength;
}
