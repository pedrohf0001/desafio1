package com.PrjDesafio.desafio1;

import com.PrjDesafio.desafio1.entities.Order;
import com.PrjDesafio.desafio1.services.OrderService;
import com.PrjDesafio.desafio1.services.ShippingService;
import com.PrjDesafio.desafio1.services.TotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	private TotalService totalService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Order order = new Order( 2282, 800.00, 10.0 );
		System.out.print("Pedido código ");
		System.out.println( order.getCode());
		System.out.print("Valor Total: ");
		System.out.println(totalService.totalServiceOrder(order));

	}
}
