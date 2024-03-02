package com.kaaner.hw3.controller;

import com.kaaner.hw3.entity.WeatherDetails;
import com.kaaner.hw3.enums.RangeDetails;
import com.kaaner.hw3.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weather")
@RequiredArgsConstructor
@Validated
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping
    public ResponseEntity<WeatherDetails> getWeatherInfo(@RequestParam String city,
                                                         @RequestParam String country,
                                                         @RequestParam RangeDetails range
    ) {
        return new ResponseEntity<>(weatherService.getWeatherInfo(city,country,range), HttpStatus.OK);
    }

}
