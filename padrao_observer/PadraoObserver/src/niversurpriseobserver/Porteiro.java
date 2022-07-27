package niversurpriseobserver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread {
	
	private List<ChegadaObserver> observers = new ArrayList<>();
	
	public void addChegadaObserver(ChegadaObserver observer) {
		observers.add(observer);	
	}

	@Override
	public void run() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int valor = scanner.nextInt();
			
			if (valor == 1) {
				ChegadaAniversarianteEvent evento = new ChegadaAniversarianteEvent(new Date());
				
				//notifica os observadores
				for (ChegadaObserver chegada : observers) {
					chegada.notificaChegou(evento);
				}
			} else {
				System.out.println("Alarme falso!!!");
			}
		}
	}
	
}
