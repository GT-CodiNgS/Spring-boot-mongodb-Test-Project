package lk.ijse.coursework.repo;

import lk.ijse.coursework.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CustomerRepo extends MongoRepository<Customer,String> {


}
