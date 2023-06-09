package www.neosoft.com.orderservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.neosoft.com.orderservice.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
