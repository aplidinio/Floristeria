package com.floristeria.view;

import com.floristeria.application.Controller;
import com.floristeria.domain.Entity;
import com.floristeria.domain.Florist;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Florist flowerPower = new Florist("Flower Power");
		
		Controller controller = new Controller();

		System.out.println("Has creado correctamente la floristeria " + flowerPower.getName());
		
		controller.createDecoration(Entity.getCOUNTER(), "Tabla de madera", 30, true, 20);
		controller.createFlower(Entity.getCOUNTER(), "Tulipan", 5, "red", 20);
		controller.createTree(Entity.getCOUNTER(), "Pino", 100, 20.0, 5);
		controller.seeStock();
	
	}
	
}