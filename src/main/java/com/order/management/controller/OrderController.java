package com.order.management.controller;


import com.order.management.service.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class OrderController {

    @Autowired
    OrderServices orderServices;

    @GetMapping()
    public List<Item> retrieveCoursesForStudent(@PathVariable String studentId) {
//        return orderServices;
    }

}
