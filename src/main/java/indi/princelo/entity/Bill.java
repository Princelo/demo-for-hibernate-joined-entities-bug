package indi.princelo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bill")
@Inheritance(strategy = InheritanceType.JOINED)
public class Bill {

    @Id
    private String id;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "bill", fetch = FetchType.LAZY)
    private Address address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "a Bill";
    }
}
