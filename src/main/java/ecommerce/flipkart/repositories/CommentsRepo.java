package ecommerce.flipkart.repositories;

import ecommerce.flipkart.models.Comments;
import ecommerce.flipkart.models.OrderId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsRepo extends JpaRepository<Comments, OrderId> {
   public List<Comments> findAllByItemid(int id);
}
