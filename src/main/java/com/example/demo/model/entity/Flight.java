package com.example.demo.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
@Data
public class Flight {

    @Id
    @GeneratedValue
    private Long id;

    private String flightNo;
    private String airline;
    private String aircraft;
    private String fromAirport;
    private String toAirport;
    private Date scheduledTime;
    private Date estimatedTime;
    private Date actualTime;

}
