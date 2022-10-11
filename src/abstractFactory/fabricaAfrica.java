package abstractFactory;

public class fabricaAfrica extends absFabrica {

	public absAnimal fabricarAnimal (String especie) {
		if (especie == "Agula") {
			return new Ave();
		} else if (especie == "Leao") {
			return new Mamifero();
		}
		return null;
	}
	
}
