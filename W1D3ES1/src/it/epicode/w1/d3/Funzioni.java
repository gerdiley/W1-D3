package it.epicode.w1.d3;

public class Funzioni {

	public static boolean stringaPariDispari(String stringa) {
		if (stringa.length() % 2 == 0) {
			System.out.println("Il numero di caratteri e` pari");
			return true;
		} else {
			System.out.println("Il numero di caratteri e` dispari");
			return false;
		}

	};

	public static boolean annoBisestile(int anno) {
		if (anno % 4 == 0 || (anno % 100 == 0) && (anno % 400 == 0)) {
			
			System.out.printf("L'anno %d  e` bisestile", anno);
			return false;
		}
		
		System.out.printf("L'anno %d non e` bisestile", anno);
		return false;

	}
}			