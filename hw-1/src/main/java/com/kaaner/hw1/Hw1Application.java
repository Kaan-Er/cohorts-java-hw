package com.kaaner.hw1;

import com.kaaner.hw1.entity.House;
import com.kaaner.hw1.entity.SummerHouse;
import com.kaaner.hw1.entity.Villa;
import com.kaaner.hw1.service.HouseService;

import java.util.ArrayList;
import java.util.List;

public class Hw1Application {

        public static void main(String[] args) {
            List<House> houses = new ArrayList<>();

            houses.add(new House(1, "Ankara", 3, 1, 100, 100000));
            houses.add(new Villa(2, "Istanbul", 4, 2, 150, 200000, true, true));
            houses.add(new SummerHouse(3, "Izmir", 2, 1, 80, 150000, true, 2));

            HouseService houseService = new HouseService(houses);

            System.out.println("Total price of houses: " + houseService.getTotalPriceOfHouses());
            System.out.println("Total price of villas: " + houseService.getTotalPriceOfVillas());
            System.out.println("Total price of summer houses: " + houseService.getTotalPriceOfSummerHouses());
            System.out.println("Total price of all houses: " + houseService.getTotalPriceOfAllHouses());

            System.out.println("Average square meter of houses: " + houseService.getAverageSquareMeterOfHouses());
            System.out.println("Average square meter of villas: " + houseService.getAverageSquareMeterOfVillas());
            System.out.println("Average square meter of summer houses: " + houseService.getAverageSquareMeterOfSummerHouses());
            System.out.println("Average square meter of all houses: " + houseService.getAverageSquareMeterOfAllHouses());

            List<House> filteredHouses = houseService.filterHousesByNumberOfRoomsAndLivingRooms(3, 1);
            System.out.println("\nHouses with 3 rooms and 1 living room:");
            for (House house : filteredHouses) {
                System.out.println(house);
            }
        }
}
