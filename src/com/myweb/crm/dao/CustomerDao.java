package com.myweb.crm.dao;

import com.myweb.crm.domain.Customer;

import java.util.List;

public interface CustomerDao {

    void save(Customer customer);
    List<Customer> find();
}
