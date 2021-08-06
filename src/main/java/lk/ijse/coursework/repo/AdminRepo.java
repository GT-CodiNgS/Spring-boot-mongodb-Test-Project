package lk.ijse.coursework.repo;

import lk.ijse.coursework.model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AdminRepo extends MongoRepository<Admin,String> {


}
