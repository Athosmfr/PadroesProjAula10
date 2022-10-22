package abstractFactory;

public class absFabrica implements IFabrica {

	public String cont;

	@Override
	public absFabrica fabricaCont(String cont) {
			if (cont == "America") {
				return new fabricaAmerica();
			} else if (cont == "Africa") {
				return new fabricaAfrica();
			}
			return null;
		}
	
}
