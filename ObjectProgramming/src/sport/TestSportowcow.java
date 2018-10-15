package sport;

public class TestSportowcow {

	public static void main(String[] args) {
		Sportowiec plywak = new Plywak("Adam", "Kowalski");
		Sportowiec piecioboista = new Piecioboista ("Pawel", "Nowak");
		Sportowiec biegacz = new Biegacz("Mariusz", "Lukaszewski");
		
		Sportowiec[] sportowcy = new Sportowiec[3];
		sportowcy[0] = plywak;
		sportowcy[1] = piecioboista;
		sportowcy[2] = biegacz;
		
		for (Sportowiec sportowiec : sportowcy) {
			sportowiec.wyswietl();
			sportowiec.walczOMedal();
			System.out.println("---------------------------");
		}
	}

}
