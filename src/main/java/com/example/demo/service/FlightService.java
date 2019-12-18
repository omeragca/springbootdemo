package com.example.demo.service;

import com.example.demo.dao.FlightRepository;
import com.example.demo.model.entity.Flight;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;

    public List<Flight> findAll() {
        return flightRepository.findAll();
    }

}
