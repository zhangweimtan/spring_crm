package com.myweb.crm.service;

import com.myweb.crm.dao.CustomerDao;
import com.myweb.crm.domain.Customer;
import com.myweb.crm.utils.SpringUtils;


import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public void save(Customer customer) {
        System.out.println("save customer to sql..");
        CustomerDao customerDao = SpringUtils.getCustomerDao();
        customerDao.save(customer);
    }

    @Override
    public List<Customer> find() {
        CustomerDao customerDao = SpringUtils.getCustomerDao();
        return customerDao.find();
    }
}
