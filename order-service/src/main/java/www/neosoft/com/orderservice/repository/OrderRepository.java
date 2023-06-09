package www.neosoft.com.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.neosoft.com.orderservice.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
