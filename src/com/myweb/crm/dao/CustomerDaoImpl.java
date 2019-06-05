package com.myweb.crm.dao;

import com.myweb.crm.domain.Customer;
import com.myweb.crm.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save(Customer customer) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();

    }

    @Override
    public List<Customer> find() {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        List<Customer> list = session.createQuery("from Customer").list();
        transaction.commit();
        return list;
    }
}
