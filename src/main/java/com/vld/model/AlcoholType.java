package com.vld.vld.model;



import javax.persistence.*;
import java.util.Objects;

@Table(name = "alcohol_types")
@Entity
public class AlcoholType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ID;
    @Column(name = "strength")
    private Double strength;

    public AlcoholType() {
    }

    public AlcoholType(Long ID, Double strength) {
        this.ID = ID;
        this.strength = strength;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Double getStrength() {
        return strength;
    }

    public void setStrength(Double strength) {
        this.strength = strength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlcoholType type = (AlcoholType) o;
        return Objects.equals(ID, type.ID) && Objects.equals(strength, type.strength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, strength);
    }
}
