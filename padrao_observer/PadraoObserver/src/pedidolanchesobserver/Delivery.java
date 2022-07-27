package pedidolanchesobserver;

public class Delivery implements DeliveryObserver{

	@Override
	public void update(int pedido) {
		if (pedido <= 0) {
			System.out.println("Pedido não informado. Por favor, escolha outra opção!");
		}
		
		switch(pedido) {
		   case 1: System.out.println("Sua opção. ");
		           System.out.println("Batata frita e coca-cola!");
		           break;
		   case 2: System.out.println("Sua opção. ");
                   System.out.println("Cachorro quente e coca-cola!");
                   break;
		   case 3: System.out.println("Sua opção. ");
                   System.out.println("Milkshake chocolate!");
                   break;
		   case 4: System.out.println("Sua opção. ");
                   System.out.println("Sorvete morango!");
                   break;
           default:System.out.println("Pedido não encontrado!");
		}
	}

}
