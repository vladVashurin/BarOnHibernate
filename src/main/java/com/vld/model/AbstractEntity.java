package com.vld.model;



import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "abstractentity")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
public abstract class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
}
