package com.huey.hello.dubbo.service;

import com.huey.hello.dubbo.service.CustomerService;
import com.huey.hello.dubbo.vo.Customer;

public class CustomerServiceStub implements CustomerService {

	@Override
	public Customer getCustomerById(Long custId) {
		Customer customer = new Customer();
		customer.setCustId(custId);
		customer.setCustName("HueyStub" + custId);
		return customer;
	}

}
