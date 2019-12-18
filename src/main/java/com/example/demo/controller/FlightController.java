package com.example.demo.controller;

import com.example.demo.model.entity.Flight;
import com.example.demo.service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/flight")
@RequiredArgsConstructor
public class FlightController {

    private final FlightService flightService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Flight> getFlights() {
        return flightService.findAll();
    }

}
