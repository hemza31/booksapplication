package com.laribi.booksapplication.services;

import com.laribi.booksapplication.converters.StoreConverter;
import com.laribi.booksapplication.entities.OrderEntity;
import com.laribi.booksapplication.model.Order;
import com.laribi.booksapplication.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Autowired
    private StoreConverter storeConverter;

    public void deleteOrder(Long orderId) throws Exception {
        /* TO DO */
        storeRepository.deleteById(Math.toIntExact(orderId));
    }

     public Order getOrderById(Long orderId) throws Exception {
         Optional<OrderEntity> orderEntity = storeRepository.findById(Math.toIntExact(orderId));
         Order order = storeConverter.toModel(orderEntity);
        return order;
    }

    public Order placeOrder(Order body) throws Exception {
        OrderEntity orderEntity = storeConverter.toEntity(body);
        storeRepository.save(orderEntity);
        Order order = storeConverter.toModel(Optional.of(orderEntity));
        return order;
    }
}
