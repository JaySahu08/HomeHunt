package E_CommerceWebApplication.E_CommerceApplication.Service;

import E_CommerceWebApplication.E_CommerceApplication.Repository.CustomerRepository;
import E_CommerceWebApplication.E_CommerceApplication.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    public final CustomerRepository customerRepository;

    public Customer register(Customer customer) {

        if(customerRepository.existsByEmail(customer.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        return customerRepository.save(customer);
    }

}
