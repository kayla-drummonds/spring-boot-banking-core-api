package com.banking.springboot.repository;

import com.banking.springboot.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByBirthDateAndLastName(LocalDate birthDate, String lastName);
    Page<Customer> findByLastNameContaining(String keyword, Pageable pageable);
}
