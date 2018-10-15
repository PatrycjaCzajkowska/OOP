package package1;

public class Main {

	public static void main(String[] args) {
		
		//obiekty
		Pies dino = new Pies("Dino", "Dalmatyńczyk", 3, "Czarno-biały");
		Pies burek = new Pies("Burek", "Owczarek", 5, "Brązowy");
		
		dino.szczekaj();
		System.out.println(dino.getNazwa()+" "+dino.getRasa()+" "+dino.getWiek()+" "+dino.getKolor());	
		System.out.println(dino.wiekZaKilkaLat(5));
	
		System.out.println("---------------------------");
		
		burek.szczekaj();
		System.out.println(burek.getNazwa()+" "+burek.getRasa()+" "+burek.getWiek()+" "+burek.getKolor());
		System.out.println(burek.wiekZaKilkaLat(5));
		
	}

}
