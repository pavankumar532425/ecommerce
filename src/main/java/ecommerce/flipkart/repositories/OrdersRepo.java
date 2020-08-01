package ecommerce.flipkart.repositories;

import ecommerce.flipkart.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepo extends JpaRepository<Users,Integer> {
}
