package E_CommerceWebApplication.E_CommerceApplication.Repository;

import E_CommerceWebApplication.E_CommerceApplication.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    boolean existsByEmail(String email);
}
