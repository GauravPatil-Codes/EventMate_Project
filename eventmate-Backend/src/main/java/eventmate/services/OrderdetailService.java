package eventmate.services;

import java.util.List;

import eventmate.entities.Order;
import eventmate.entities.OrderDetails;

public interface OrderdetailService {

	void saveOrderDetails(OrderDetails od);
	OrderDetails findById(int id);
	List<OrderDetails> findByOrder(Order order);
}
