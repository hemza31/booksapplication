package com.laribi.booksapplication.converters;

import com.laribi.booksapplication.entities.OrderEntity;
import com.laribi.booksapplication.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StoreConverter {

    public Order toModel(Optional<OrderEntity> orderEntity){
        final Order order = new Order();

        order.setId(orderEntity.getId());
        order.setBookId(orderEntity.getBookId());
        order.setComplete(orderEntity.isComplete());
        order.setQuantity(orderEntity.getQuantity());
        order.setShipDate(orderEntity.getShipDate());
        return order;

    }

    public OrderEntity toEntity (Order order){
        final OrderEntity orderEntity = new OrderEntity();

        orderEntity.setId(order.getId());
        orderEntity.setBookId(order.getBookId());
        //orderEntity.setComplete(order.getComplete);
        orderEntity.setQuantity(order.getQuantity());
        orderEntity.setShipDate(order.getShipDate());

        return orderEntity;
    }

    public List<Order> toModelList(List<OrderEntity> orderEntityList){

        List<Order> returnedOrderList = new ArrayList<Order>();

        Order order;
        for (final OrderEntity orderEntity : orderEntityList) {
            order = this.toModel(orderEntity);
            returnedOrderList.add(order);
        }
        return returnedOrderList;
    }

    public List<OrderEntity> toEntitylList(List<Order> orderList){

        List<OrderEntity> returnedOrderEntityList = new ArrayList<OrderEntity>();

        OrderEntity orderEntity;
        for (final Order order : orderList) {
            orderEntity = this.toEntity(order);
            returnedOrderEntityList.add(orderEntity);
        }

        return returnedOrderEntityList;
    }

}
