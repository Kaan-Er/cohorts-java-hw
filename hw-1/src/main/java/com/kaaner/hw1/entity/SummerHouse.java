package com.kaaner.hw1.entity;

public class SummerHouse extends House {

    private boolean hasSeaView;
    private int numberOfBalconies;

    public SummerHouse(int id, String address, int numberOfRooms, int numberOfLivingRooms, int squareMeters, int price, boolean hasSeaView, int numberOfBalconies) {
        super(id, address, numberOfRooms, numberOfLivingRooms, squareMeters, price);
        this.hasSeaView = hasSeaView;
        this.numberOfBalconies = numberOfBalconies;
    }

    public boolean isHasSeaView() {
        return hasSeaView;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    public int getNumberOfBalconies() {
        return numberOfBalconies;
    }

    public void setNumberOfBalconies(int numberOfBalconies) {
        this.numberOfBalconies = numberOfBalconies;
    }

    @Override
    public String toString() {
        return "SummerHouse{" +
                "id=" + getId() +
                ", address='" + getAddress() + '\'' +
                ", numberOfRooms=" + getNumberOfRooms() +
                ", numberOfLivingRooms=" + getNumberOfLivingRooms() +
                ", squareMeters=" + getSquareMeters() +
                ", price=" + getPrice() +
                ", hasSeaView=" + hasSeaView +
                ", numberOfBalconies=" + numberOfBalconies +
                '}';
    }
}

