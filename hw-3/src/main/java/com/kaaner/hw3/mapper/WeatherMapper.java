package com.kaaner.hw3.mapper;

import com.kaaner.hw3.dto.Weather;
import com.kaaner.hw3.entity.WeatherDetails;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface WeatherMapper {
    WeatherMapper INSTANCE = Mappers.getMapper(WeatherMapper.class);
    WeatherDetails convert(Weather weather);
}
