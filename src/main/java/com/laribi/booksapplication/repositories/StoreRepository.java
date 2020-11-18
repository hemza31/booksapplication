package com.laribi.booksapplication.repositories;

import com.laribi.booksapplication.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<OrderEntity, Integer> {


}
