package lk.ijse.coursework.service.impl;


import lk.ijse.coursework.dto.CustomerDTO;
import lk.ijse.coursework.model.Customer;
import lk.ijse.coursework.exception.ValidateException;
import lk.ijse.coursework.repo.CustomerRepo;
import lk.ijse.coursework.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author : Gayash Thasmika
 * @date:7/22/2021
 * @since : 0.0.1
 **/
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    private ModelMapper mapper;

    public boolean addCustomer(CustomerDTO dto) {
        if (customerRepo.existsById(dto.getId())) {
            throw new ValidateException("Customer Already Exist");
        }
        customerRepo.save(mapper.map(dto, Customer.class));
        return true;
    }

    public CustomerDTO searchCustomer( String id) {
        Optional<Customer> customer = customerRepo.findById(id);
        if (customer.isPresent()) {
            return mapper.map(customer.get(), CustomerDTO.class);
        }

        return null;
    }


    public boolean deleteCustomer(String id) {
        if (!customerRepo.existsById(id)) {
            throw new ValidateException("No Customer for Delete..!");
        }
        customerRepo.deleteById(id);
        return true;
    }


    public boolean updateCustomer(CustomerDTO dto) {
        if (customerRepo.existsById(dto.getId())){
            customerRepo.save(mapper.map(dto,Customer.class));
            return true;
        }
        return false;
    }

    public ArrayList<CustomerDTO> getAllCustomers() {
        List<Customer> allCustomers = customerRepo.findAll();
        return mapper.map(allCustomers, new TypeToken<ArrayList<CustomerDTO>>() {}.getType());
    }
}
