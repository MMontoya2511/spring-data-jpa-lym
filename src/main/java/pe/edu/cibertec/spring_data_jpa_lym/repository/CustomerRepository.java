package pe.edu.cibertec.spring_data_jpa_lym.repository;

import pe.edu.cibertec.spring_data_jpa_lym.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
