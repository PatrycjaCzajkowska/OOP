package package1;

public class Pies {
	
	//prywatne pola klasy określające jej stan

	private String nazwa;
	private String rasa;
	private int wiek;
	private String kolor;
	
	//konstruktor
	public Pies(String nazwa, String rasa, int wiek, String kolor) {
		super();
		this.nazwa = nazwa; //this odróżnia pole obiektu od argumentu konstruktora
		this.rasa = rasa;
		this.wiek = wiek;
		this.kolor = kolor;
	}
	
	//metody określają zachowanie
	void szczekaj() {
		System.out.println("hau! hau!");
	}
	
	int wiekZaKilkaLat(int lata) {
		return wiek+lata;
	}

	//ustawienie dostepu do pol przez gettery i settery
	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	public String getKolor() {
		return kolor;
	}

	public void setKolor(String kolor) {
		this.kolor = kolor;
	}

	
	
	
	
	
}
