package abstractFactory;

public class fabricaAmerica extends absFabrica {
	
	public String fabricarAnimal (String tipo) {
		if (tipo == "Ave") {
			return new aveArara().escritura();
		} else if (tipo == "Mamifero") {
			return new mamAnta().escritura();
		}
		return null;
	}
	
}
