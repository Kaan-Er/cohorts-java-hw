package com.kaaner.hw3.service;

import com.kaaner.hw3.client.WeatherClient;
import com.kaaner.hw3.dto.Weather;
import com.kaaner.hw3.entity.WeatherDetails;
import com.kaaner.hw3.enums.RangeDetails;
import com.kaaner.hw3.exception.WeatherException;
import com.kaaner.hw3.mapper.WeatherMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService{

    private final WeatherClient weatherClient;
    private final WeatherMapper weatherInfoMapper;
    @Override
    public WeatherDetails getWeatherInfo(String city, String country, RangeDetails range) {

        StringBuilder builder = new StringBuilder();

        try {
            LocalDate startDate = LocalDate.now();
            builder.append(startDate);
            if (range.equals(RangeDetails.WEEKLY)){
                builder.append("/").append(startDate.plusDays(6));
            }

            ResponseEntity<Weather> weather = weatherClient.getData(city, country, String.valueOf(builder));

            return weatherInfoMapper.convert(weather.getBody());

        } catch (Exception e) {
            throw new WeatherException("An error occurred while getting weather information. Please try again later.");
        }
    }
}
