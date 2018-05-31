package com.huey.hello.dubbo.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.huey.hello.dubbo.service.CustomerService;
import com.huey.hello.dubbo.vo.Customer;

/**
 * 
 * @author huey
 */
@WebServlet(name = "customerController", urlPatterns = { "/customer" })
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private CustomerService customerService;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long custId = Long.valueOf(req.getParameter("custId"));
		Customer customer = customerService.getCustomerById(custId);
		resp.getWriter().println(customer);
	}

}
