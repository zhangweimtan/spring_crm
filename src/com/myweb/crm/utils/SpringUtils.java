package com.myweb.crm.utils;

import com.myweb.crm.dao.CustomerDao;
import com.myweb.crm.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtils {
    private static CustomerDao customerDao;
    private static CustomerService customerService;

    static {
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        customerService = (CustomerService) applicationContext.getBean("customerService");
    }
    public static CustomerDao getCustomerDao(){
        return customerDao;
    }
    public static CustomerService getCustomerService(){
        return customerService;
    }
}
