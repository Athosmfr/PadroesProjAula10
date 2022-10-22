package abstractFactory;

public class main {
	
	public static void main(String[] args) {
		
		Ave aveAfrica = new Ave();
		
		aveAfrica.alimentacao = "Peixes";
		aveAfrica.cor = "Preta";
		aveAfrica.especie = "Agula";
		
		absFabrica fab1 = new absFabrica();
		fab1.fabricaCont("America");
		
		
		
	}

}
