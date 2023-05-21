package eventmate.services;

import java.util.List;

import eventmate.entities.Customer;
import eventmate.entities.Order;

public interface OrderService {

	Order saveOrder(Order order);
	List<Order> getAllOrders();
	List<Order> getCustomerOrders(Customer customer);
	Order findById(int id);
}
