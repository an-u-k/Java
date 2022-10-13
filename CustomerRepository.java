package com.demo.repo;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.demo.model.Customer;



@Repository
public interface CustomerRepository extends JpaRepositoryImplementation<Customer, Integer> {

	@Query("from Customer where accountNo=?1")
	public  Customer findCustomerByAccountNumber(String accountNo);

	@Query("UPDATE Customer SET isActive=false where accountNo=?1")
	public Customer deleteCustomer(Customer customer);
}
