package com.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerById(long customerId) {
        return customerRepository.findById(customerId);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(long customerId, Customer customer) {
        if (customerRepository.existsById(customerId)) {
            customer.setCustomerId(customerId);
            return customerRepository.save(customer);
        } else {
            // Handle not found scenario
            return null;
        }
    }

    @Override
    public void deleteCustomer(long customerId) {
        customerRepository.deleteById(customerId);
    }
}
