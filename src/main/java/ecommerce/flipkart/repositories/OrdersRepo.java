package ecommerce.flipkart.repositories;

import ecommerce.flipkart.models.OrderId;
import ecommerce.flipkart.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepo extends JpaRepository<Orders, OrderId> {
    public List<Orders> findAllByUserid(String email);
}
