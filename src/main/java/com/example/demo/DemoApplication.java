package com.example.demo;

import com.example.demo.dao.FlightRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.model.entity.Flight;
import com.example.demo.model.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner createDummyData(UserRepository userRepository, FlightRepository flightRepository) {
        return args -> {
            /*
            if (userRepository.count() == 0) {
                User user = new User();
                user.setUsername("admin");
                user.setPassword("pass");
                user.setRole("ADMIN");
                userRepository.save(user);
            }
            */
            if (flightRepository.count() == 0) {
                Flight flight = new Flight();
                flight.setAirline("ABC");
                flight.setFlightNo("1234");
                flight.setAircraft("321");
                flight.setFromAirport("IST");
                flight.setToAirport("AYT");
                flight.setScheduledTime(new Date());
                flight.setEstimatedTime(new Date());
                flight.setActualTime(new Date());
                flightRepository.save(flight);
            }
        };
    }

}
