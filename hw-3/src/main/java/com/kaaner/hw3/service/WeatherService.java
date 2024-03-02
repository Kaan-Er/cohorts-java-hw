package com.kaaner.hw3.service;

import com.kaaner.hw3.entity.WeatherDetails;
import com.kaaner.hw3.enums.RangeDetails;

public interface WeatherService {
    WeatherDetails getWeatherInfo(String city, String country, RangeDetails range);
}
