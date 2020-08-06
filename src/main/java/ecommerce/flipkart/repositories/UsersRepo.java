package ecommerce.flipkart.repositories;

import ecommerce.flipkart.models.Users;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepo extends JpaRepository<Users,String> {
    List<Users> findByEmail(String email);
}
