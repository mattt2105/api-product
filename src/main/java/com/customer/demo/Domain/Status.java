package com.customer.demo.Domain;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

@Entity
@Table(name = "trx_status")
@JsonPropertyOrder({"id", "name"})
public class Status {

    @Id
    @Column(name = "id", nullable = false)
    private Integer Id;

    @Column(name = "name")
    private String name;

    public Status() {
    }

    public Status(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
