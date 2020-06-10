package com.javaorders.demo.repositories;

import com.javaorders.demo.models.Payments;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository<Payments, Long> {

}
