package com.github.dmitrKuznetsov.orderms.controllers;

import com.github.dmitrKuznetsov.orderms.mappers.entities.Order;
import com.github.dmitrKuznetsov.orderms.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    public OrderService orderService;

    @GetMapping("{id}")
    Order getById(@PathVariable int id) {
        Order order = orderService.findById(id);
        if (order == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return order;
    }

    @PostMapping
    void create(@RequestBody Order order) {

    }

    @PutMapping("{id}")
    void update(@PathVariable int id, @RequestBody Order order) {

    }

    @DeleteMapping("{id}")
    void deleteById(@PathVariable int id) {

    }
}
