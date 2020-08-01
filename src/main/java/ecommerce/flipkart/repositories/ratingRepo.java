package ecommerce.flipkart.repositories;

import ecommerce.flipkart.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ratingRepo extends JpaRepository<Users,Integer> {
}
