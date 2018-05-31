package com.huey.hello.dubbo.service.impl;

import org.springframework.stereotype.Service;

import com.huey.hello.dubbo.service.CustomerService;
import com.huey.hello.dubbo.vo.Customer;

/**
 * 服务实现
 * @author huey
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Override
	public Customer getCustomerById(Long custId) {
		Customer customer = new Customer();
		customer.setCustId(custId);
		customer.setCustName("Huey" + custId);
		return customer;
	}

}
