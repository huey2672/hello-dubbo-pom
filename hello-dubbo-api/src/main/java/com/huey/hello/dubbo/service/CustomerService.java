package com.huey.hello.dubbo.service;

import com.huey.hello.dubbo.vo.Customer;

/**
 * 服务接口
 * @author huey
 */
public interface CustomerService {
	public Customer getCustomerById(Long custId);
}
