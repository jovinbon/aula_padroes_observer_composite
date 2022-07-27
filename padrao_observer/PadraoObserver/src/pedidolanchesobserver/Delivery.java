package pedidolanchesobserver;

public class Delivery implements DeliveryObserver{

	@Override
	public void update(int pedido) {
		if (pedido <= 0) {
			System.out.println("Pedido n�o informado. Por favor, escolha outra op��o!");
		}
		
		switch(pedido) {
		   case 1: System.out.println("Sua op��o. ");
		           System.out.println("Batata frita e coca-cola!");
		           break;
		   case 2: System.out.println("Sua op��o. ");
                   System.out.println("Cachorro quente e coca-cola!");
                   break;
		   case 3: System.out.println("Sua op��o. ");
                   System.out.println("Milkshake chocolate!");
                   break;
		   case 4: System.out.println("Sua op��o. ");
                   System.out.println("Sorvete morango!");
                   break;
           default:System.out.println("Pedido n�o encontrado!");
		}
	}

}
