package abstractFactory;

public class fabricaAfrica extends absFabrica {

	public String fabricarAnimal (String tipo) {
		if (tipo == "Ave") {
			return new aveAgula().escritura();
		} else if (tipo == "Mamifero") {
			return new mamLeao().escritura();
		}
		return null;
	}
	
}
