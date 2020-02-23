package com.pixelstudio.crudapp.repository;

import com.pixelstudio.crudapp.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers,Long> {

}
