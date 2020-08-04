package ecommerce.flipkart.repositories;

import ecommerce.flipkart.models.Comments;
import ecommerce.flipkart.models.OrderId;
import ecommerce.flipkart.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepo extends JpaRepository<Comments, OrderId> {
}
