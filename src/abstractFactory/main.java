package abstractFactory;

public class main {
	
	public static void main(String[] args) {
	
		absFabrica fab1 = new absFabrica();
		fab1.fabricaCont("America", "Ave");
		
		System.out.println(fab1.fabricaCont("America", "Ave"));
		
		absFabrica fab2 = new absFabrica();
		System.out.println(fab2.fabricaCont("America", "Mamifero"));
		
		absFabrica fab3 = new absFabrica();
		System.out.println(fab3.fabricaCont("Africa", "Ave"));
		
		absFabrica fab4 = new absFabrica();
		System.out.println(fab4.fabricaCont("Africa", "Mamifero"));
		
		
	}

}
