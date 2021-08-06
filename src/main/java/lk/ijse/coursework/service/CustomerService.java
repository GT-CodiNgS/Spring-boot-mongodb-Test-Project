package lk.ijse.coursework.service;

import lk.ijse.coursework.dto.CustomerDTO;

import java.util.ArrayList;


public interface CustomerService {
    boolean addCustomer(CustomerDTO dto);

    CustomerDTO searchCustomer(String id);

    boolean deleteCustomer(String id);



    boolean updateCustomer(CustomerDTO dto);

    ArrayList<CustomerDTO> getAllCustomers();

}
