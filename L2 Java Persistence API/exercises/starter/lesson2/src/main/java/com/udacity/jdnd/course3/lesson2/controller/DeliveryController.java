package com.udacity.jdnd.course3.lesson2.controller;

import com.udacity.jdnd.course3.lesson2.data.Delivery;
import com.udacity.jdnd.course3.lesson2.data.DeliveryRepository;
import com.udacity.jdnd.course3.lesson2.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
        @Autowired
        DeliveryService deliveryService;

        @PostMapping
        public Long scheduleDelivery(@RequestBody Delivery delivery) {
            return deliveryService.save(delivery);
        }


}
