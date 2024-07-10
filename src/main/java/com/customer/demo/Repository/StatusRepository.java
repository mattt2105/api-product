package com.customer.demo.Repository;

import com.customer.demo.Domain.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatusRepository extends JpaRepository<Status,Integer> {

    List<Status> findAllByOrderByIdAsc();
}
