package pedidolanchesobserver;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Delivery delivery = new Delivery();
		Atendimento atendimento = new Atendimento();
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			int pedido = scanner.nextInt();
			//atendimento.fazerPedido(pedido);
			System.out.println("Pedido " + pedido);
			delivery.update(pedido);
			atendimento.addDelyveryObserver(delivery);			
		}

	}

}
