package com.kaaner.hw2.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Invoice {
    private LocalDateTime invoiceDateTime;
    private Double totalPrice;
    private Order order;

    public Invoice(LocalDateTime invoiceDateTime, Order order) {
        this.invoiceDateTime = invoiceDateTime;
        this.order = order;
        setTotalPrice();
    }

    public void setTotalPrice(){
        Double total = 0.0;

        for (Product p : order.getProducts()){
            total+=p.getPrice();
        }
        this.totalPrice = total;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceDateTime=" + invoiceDateTime +
                ", totalPrice=" + totalPrice +
                ", order=" + order +
                '}';
    }
}
