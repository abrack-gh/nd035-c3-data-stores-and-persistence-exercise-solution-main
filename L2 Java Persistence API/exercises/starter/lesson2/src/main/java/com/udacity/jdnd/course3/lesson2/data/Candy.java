package com.udacity.jdnd.course3.lesson2.data;

import javax.persistence.*;

@Entity
public class Candy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long
            id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
