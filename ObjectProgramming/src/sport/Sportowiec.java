package sport;

public abstract class Sportowiec {

	private String imie;
	private String nazwisko;
	
	
	
	
	
	
	public Sportowiec(String imie, String nazwisko) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public abstract void walczOMedal();
	
	public void wyswietl() {
		System.out.println("Imie: "+ imie + " Nazwisko: "+ nazwisko);
	}
	
}
