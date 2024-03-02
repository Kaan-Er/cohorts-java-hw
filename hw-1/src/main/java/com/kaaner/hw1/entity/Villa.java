package com.kaaner.hw1.entity;

public class Villa extends House {

    private boolean hasPool;
    private boolean hasGarden;

    public Villa(int id, String address, int numberOfRooms, int numberOfLivingRooms, int squareMeters, int price, boolean hasPool, boolean hasGarden) {
        super(id, address, numberOfRooms, numberOfLivingRooms, squareMeters, price);
        this.hasPool = hasPool;
        this.hasGarden = hasGarden;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "id=" + getId() +
                ", address='" + getAddress() + '\'' +
                ", numberOfRooms=" + getNumberOfRooms() +
                ", numberOfLivingRooms=" + getNumberOfLivingRooms() +
                ", squareMeters=" + getSquareMeters() +
                ", price=" + getPrice() +
                ", hasPool=" + hasPool +
                ", hasGarden=" + hasGarden +
                '}';
    }
}

