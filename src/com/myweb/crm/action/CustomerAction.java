package com.myweb.crm.action;

import com.myweb.crm.domain.Customer;
import com.myweb.crm.service.CustomerService;
import com.myweb.crm.utils.SpringUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    private Customer customer = new Customer();

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public Customer getModel() {
        return customer;
    }

    public String addUI(){

        return "addUI";
    }

//    保存customer,跳转
    /*
    *
    * */
    public String save(){
        CustomerService customerService = SpringUtils.getCustomerService();
        customerService.save(customer);
        System.out.println("save方法调用了");
        return "save";

    }

    public String find(){
        CustomerService customerService = SpringUtils.getCustomerService();
        List<Customer> list = customerService.find();
        ActionContext.getContext().getValueStack().set("list",list);
        return "find";
    }
}
