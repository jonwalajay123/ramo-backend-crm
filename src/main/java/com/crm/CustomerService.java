package com.crm;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Optional<Customer> getCustomerById(long customerId);

    Customer createCustomer(Customer customer);

    Customer updateCustomer(long customerId, Customer customer);

    void deleteCustomer(long customerId);
}

