package com.learn.stockmanagementapi.controller;

import com.learn.stockmanagementapi.model.Stockmodel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class Stockcontroller {
    @GetMapping
    public Stockmodel getUser()
    {
        Stockmodel stock = new Stockmodel();
        stock.setStock_id("#355");
        stock.setStock_name("ADANIENT");
        stock.setStock_Value(10);
        return stock;
    }
}

