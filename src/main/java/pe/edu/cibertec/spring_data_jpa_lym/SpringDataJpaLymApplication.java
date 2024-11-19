package pe.edu.cibertec.spring_data_jpa_lym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.cibertec.spring_data_jpa_lym.repository.CustomerRepository;

@SpringBootApplication
public class SpringDataJpaLymApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaLymApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {


		customerRepository.findAll().forEach(System.out::println);
	}

}
