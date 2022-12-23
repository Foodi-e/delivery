package com.itstep.exam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String title;
    private String lng;
    private String lat;
    private String location = lng + lat;

    private String city;
    private String street;
    private String address = city + street + location;

    @ManyToMany(mappedBy = "warehouses")
    private List<Delivery> deliveries;

}
