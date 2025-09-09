package com.PrjDesafio.desafio1.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(double result) {

        if (result < 100.00)
            return 20.0;

        else if (result >= 100.00 && result < 200.00) {
            return 12.0;

        }
        return 0;
    }
}
