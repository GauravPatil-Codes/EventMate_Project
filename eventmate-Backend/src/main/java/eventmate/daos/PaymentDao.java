package eventmate.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import eventmate.entities.Payment;

public interface PaymentDao extends JpaRepository<Payment, Integer> {

}
