package com.PrjDesafio.desafio1.services;

import com.PrjDesafio.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public double totalOrder(double valorBasic, double descPercent ){

        return valorBasic * (descPercent / 100.00);

    }

}
