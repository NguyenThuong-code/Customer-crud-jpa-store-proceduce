package com.thuong.service;

import com.thuong.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
