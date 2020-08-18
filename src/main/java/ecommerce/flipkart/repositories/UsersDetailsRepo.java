package ecommerce.flipkart.repositories;

import ecommerce.flipkart.models.UsersDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersDetailsRepo extends JpaRepository<UsersDetails,String> {
    List<UsersDetails> findByEmail(String email);
}
