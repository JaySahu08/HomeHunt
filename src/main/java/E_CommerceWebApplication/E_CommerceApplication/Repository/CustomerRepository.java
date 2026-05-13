package E_CommerceWebApplication.E_CommerceApplication.Repository;

import E_CommerceWebApplication.E_CommerceApplication.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    boolean existsByEmail(String email);
}
