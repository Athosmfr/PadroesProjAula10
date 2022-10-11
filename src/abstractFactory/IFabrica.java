package abstractFactory;

public interface IFabrica {
	
	public default absFabrica fabricarAnimal(String cont) {
		if (cont == "America") {
			return new fabricaAmerica();
		} else if (cont == "Africa") {
			return new fabricaAfrica();
		}
		return null;
	}

}

// ver de criar uma classe ao inves de interface;
