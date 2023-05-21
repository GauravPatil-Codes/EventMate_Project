package eventmate.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eventmate.entities.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
	
	Customer findByUserid(String userid);
}