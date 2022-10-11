package abstractFactory;

public class fabricaAmerica extends absFabrica {
	
	public absAnimal fabricarAnimal (String especie) {
		if (especie == "Arara") {
			return new Ave();
		} else if (especie == "Anta") {
			return new Mamifero();
		}
		return null;
	}
	
}
