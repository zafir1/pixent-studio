package com.zafir.crudapp.repository;

import com.zafir.crudapp.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers,Long> {

}
