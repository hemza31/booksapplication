package com.laribi.booksapplication.controllers;

import com.laribi.booksapplication.api.StoreApi;
import com.laribi.booksapplication.model.Order;
import com.laribi.booksapplication.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Map;

@RestController    // This means that this class is a Controller
@RequestMapping(path="/")
public class StoreController implements StoreApi {

    @Autowired
    private StoreService storeService;

    @Override
    @RequestMapping(value = "/store/order", consumes="*/*", method = RequestMethod.POST)
    public void deleteOrder(@Min(1) Long orderId) throws Exception {
        storeService.deleteOrder(orderId);
    }

    @Override
    @RequestMapping(value = "/store/order/{orderId}", consumes="*/*", method = RequestMethod.GET)
    public Order getOrderById(@Min(1) @Max(10) Long orderId) throws Exception {
        Order order = storeService.getOrderById(orderId);
    return order;
    }

    @Override
    @RequestMapping(value = "/store/order/{orderId}", consumes="*/*", method = RequestMethod.DELETE)
    public Order placeOrder(@Valid Order body) throws Exception {
        Order order = storeService.placeOrder(body);
        return order;
    }
}
