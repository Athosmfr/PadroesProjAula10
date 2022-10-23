package abstractFactory;

public class absFabrica implements IFabrica {

	public String cont;

	@Override
	public String fabricaCont(String cont, String tipo) {
			if (cont == "America") {
				return new fabricaAmerica().fabricarAnimal(tipo);
			} else if (cont == "Africa") {
				return new fabricaAfrica().fabricarAnimal(tipo);
			}
			return null;
		}
	
}
