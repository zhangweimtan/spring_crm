package com.myweb.crm.service;

import com.myweb.crm.domain.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);
    List<Customer> find();
}
