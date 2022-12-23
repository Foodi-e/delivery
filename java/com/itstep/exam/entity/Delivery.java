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
public class Delivery{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String warehouseFrom;
    private String warehouseTo;
    private String cargoName;
    private int cargoAmount;
    private DeliveryStatus status;

    @ManyToOne
    @JoinColumn(name = "transporter")
    private Transporter transporter;

    @ManyToMany
    @JoinTable(name = "warehouse_delivery",
            joinColumns = @JoinColumn(name = "warehouse_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "delivery_id", referencedColumnName = "id"))
    private List<Warehouse> warehouses;

}
