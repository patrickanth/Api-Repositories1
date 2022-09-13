package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "car")
public class Car {

    @Id
    @Column(nullable = false, name = "serial_Number", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serialNumber;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,name = "model_Name")
    private String modelName;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "current_Price")
    private int currentPrice;

}
