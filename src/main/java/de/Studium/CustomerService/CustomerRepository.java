package de.Studium.CustomerService;

import de.Studium.CustomerService.entity.CustomerObject;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CustomerRepository extends MongoRepository<CustomerObject,String> {

    public CustomerObject findByMFirstName(String firstName);
    public List<CustomerObject> findByMLastName(String lastName);
}
