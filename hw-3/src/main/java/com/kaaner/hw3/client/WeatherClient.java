package com.kaaner.hw3.client;

import com.kaaner.hw3.dto.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "weather", url = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline")
public interface WeatherClient {

    @Value("${weather.api.key}")
    String API_KEY = null;

    @GetMapping("/{city},{countryCode}/{startEndDate}/?key=${weather.api.key}")
    ResponseEntity<Weather> getData(@PathVariable(value = "city") String city,
                                    @PathVariable(value = "countryCode") String countryCode,
                                    @PathVariable String startEndDate);
}
