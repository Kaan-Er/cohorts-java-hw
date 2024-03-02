package com.kaaner.hw2.service;

import com.kaaner.hw2.entity.Customer;

public interface CustomerService {

    void findAll();
    void save(Customer customer);
    void filterIfNameIncludesC();
}
