package numintegerobserver;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		//Objeto observado
		NumeroInteiroList list = new NumeroInteiroList();
		
		//Objeto observador
		Notificacao notificacao = new Notificacao();
		
		list.addObserver(notificacao);
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("Digite um número:");
			int num = scanner.nextInt();
			list.adicionar(num);
		}
		
	}

}
