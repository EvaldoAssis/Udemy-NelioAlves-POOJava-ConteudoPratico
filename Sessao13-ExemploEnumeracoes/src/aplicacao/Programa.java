package aplicacao;

import java.util.Date;

import entidade.enums.OrderStatus;
import entidades.Pedido;

public class Programa {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(pedido);
		
		//Convertendo uma String para um valor ENUMERADO
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
