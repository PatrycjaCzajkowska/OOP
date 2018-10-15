package sport;

public class Piecioboista extends Sportowiec implements Bieganie, Plywanie{

	
	
	
	public Piecioboista(String imie, String nazwisko) {
		super(imie, nazwisko);
		
	}

	@Override
	public void plyn() {
		System.out.println("Plyne");
		
	}

	@Override
	public void biegnij() {
		System.out.println("Biegne");
		
	}

	@Override
	public void walczOMedal() {
		plyn();
		rozpocznijSzermierke();
		rozpocznijJazdeKonna();
		biegnij();
		strzelaj();
		
	}
	
	
	public void rozpocznijSzermierke() {
		System.out.println("Rozpoczynam szermierke");
	}
	
	public void rozpocznijJazdeKonna() {
		System.out.println("Rozpoczynam jazde konna");
	}

	public void strzelaj() {
		System.out.println("Strzelam");
	}
	
}
