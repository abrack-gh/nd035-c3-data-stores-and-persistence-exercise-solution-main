package com.udacity.jdnd.course3.lesson2.Query;


import com.udacity.jdnd.course3.lesson2.data.Plant;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.util.List;


@NamedQuery(name = "Delivery.findByName",
        query = "select d from Delivery d where d.name = :name")
@Entity
public class Deliveries {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "delivery", cascade = CascadeType.ALL)
    private List<Plant> plant;

}
