package abstractFactory;

public class aveArara extends Ave {

	public String especie = "Arara";
	public String alimentacao = "Sementes";
	public String comportamento = "Social";
	@Override
	public String escritura() {
		// TODO Auto-generated method stub
		return "Animal: " + especie + "\nAlimentacao: " + alimentacao + "\nComportamento: " + comportamento + "\nColoracao: " + cor + "\n";
	}
	
	
}
