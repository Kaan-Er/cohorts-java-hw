package com.kaaner.hw2.service;

import com.kaaner.hw2.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private final List<Customer> customerList = new ArrayList<>();

    @Override
    public void findAll() {
        customerList.forEach(System.out::println);
    }
    @Override
    public void save(Customer customer) {
        customerList.add(customer);
    }
    @Override
    public void filterIfNameIncludesC() {
        List<Customer> list = customerList.stream().filter(customer -> customer.getName().contains("C") ||customer.getName().contains("c"))
                .toList();
        list.forEach(System.out::println);
    }
}
