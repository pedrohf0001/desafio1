package com.PrjDesafio.desafio1.services;

import com.PrjDesafio.desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TotalService {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ShippingService shippingService;

    public double totalServiceOrder(Order order){
        return (order.getBasic() - orderService.totalOrder(order.getBasic(), order.getDiscount()))
                + shippingService.shipment(order.getBasic());
    }
}
