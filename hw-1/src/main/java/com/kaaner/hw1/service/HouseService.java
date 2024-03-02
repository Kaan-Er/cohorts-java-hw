package com.kaaner.hw1.service;

import com.kaaner.hw1.entity.House;
import com.kaaner.hw1.entity.SummerHouse;
import com.kaaner.hw1.entity.Villa;

import java.util.ArrayList;
import java.util.List;

public class HouseService {

    private List<House> houses;

    public HouseService(List<House> houses) {
        this.houses = houses;
    }

    public int getTotalPriceOfHouses() {
        int total = 0;
        for (House house : houses) {
            if (house instanceof House) {
                total += house.getPrice();
            }
        }
        return total;
    }

    public int getTotalPriceOfVillas() {
        int total = 0;
        for (House house : houses) {
            if (house instanceof Villa) {
                total += house.getPrice();
            }
        }
        return total;
    }

    public int getTotalPriceOfSummerHouses() {
        int total = 0;
        for (House house : houses) {
            if (house instanceof SummerHouse) {
                total += house.getPrice();
            }
        }
        return total;
    }

    public int getTotalPriceOfAllHouses() {
        int total = 0;
        for (House house : houses) {
            total += house.getPrice();
        }
        return total;
    }

    public double getAverageSquareMeterOfHouses() {
        int totalSquareMeters = 0;
        int houseCount = 0;
        for (House house : houses) {
            if (house instanceof House) {
                totalSquareMeters += house.getSquareMeters();
                houseCount++;
            }
        }
        return (double) totalSquareMeters / houseCount;
    }

    public double getAverageSquareMeterOfVillas() {
        int totalSquareMeters = 0;
        int houseCount = 0;
        for (House house : houses) {
            if (house instanceof Villa) {
                totalSquareMeters += house.getSquareMeters();
                houseCount++;
            }
        }
        return (double) totalSquareMeters / houseCount;
    }

    public double getAverageSquareMeterOfSummerHouses() {
        int totalSquareMeters = 0;
        int houseCount = 0;
        for (House house : houses) {
            if (house instanceof SummerHouse) {
                totalSquareMeters += house.getSquareMeters();
                houseCount++;
            }
        }
        return (double) totalSquareMeters / houseCount;
    }

    public double getAverageSquareMeterOfAllHouses() {
        int totalSquareMeters = 0;
        int houseCount = 0;
        for (House house : houses) {
            totalSquareMeters += house.getSquareMeters();
            houseCount++;
        }
        return (double) totalSquareMeters / houseCount;
    }

    public List<House> filterHousesByNumberOfRoomsAndLivingRooms(int numberOfRooms, int numberOfLivingRooms) {
        List<House> filteredHouses = new ArrayList<>();
        for (House house : houses) {
            if (house.getNumberOfRooms() == numberOfRooms && house.getNumberOfLivingRooms() == numberOfLivingRooms) {
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }

}

