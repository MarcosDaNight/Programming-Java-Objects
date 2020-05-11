package aplication;

import java.util.Date;

import entites.OrderEnum;
import entites.enums.OrderStatus;

public class ProgramEnum {

	public static void main(String[] args) {

		OrderEnum order = new OrderEnum(1080, new Date(), OrderStatus.PEDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
