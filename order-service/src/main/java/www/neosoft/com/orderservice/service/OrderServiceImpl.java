package www.neosoft.com.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import www.neosoft.com.orderservice.model.Order;
import www.neosoft.com.orderservice.repository.OrderRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}
