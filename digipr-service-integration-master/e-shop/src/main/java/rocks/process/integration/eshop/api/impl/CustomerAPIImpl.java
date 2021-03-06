/*
 * Copyright (c) 2018. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.integration.eshop.api.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import rocks.process.integration.eshop.api.CustomerAPI;
import rocks.process.integration.eshop.domain.Customer;
import rocks.process.integration.eshop.repository.CustomerRepository;

import java.util.UUID;


@Component
public class CustomerAPIImpl implements CustomerAPI {

	
    private Logger logger = LoggerFactory.getLogger(CustomerAPIImpl.class);

	@Autowired
	public CustomerRepository customerRepository;
	
    @Override
    public Customer findCustomer(String customerId) {
    	//get customer by Id from DB
       // return new Customer(Long.parseLong(customerId), "Business", 20000, UUID.randomUUID().toString(), UUID.randomUUID().toString());
        
        Customer c = customerRepository.findById(Long.parseLong(customerId)).get();
        return c;
        
    }

    @Override
    public void editLoyaltyBalance(String customerId, Customer customer) {
        logger.info("customerId: " + customerId + ". points " + customer.getLoyalityPoints());
    }
}
