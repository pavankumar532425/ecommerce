package ecommerce.flipkart.repositories;

import ecommerce.flipkart.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepo extends JpaRepository<User,Integer> {
   Optional<User> findByusername(String username);
}
