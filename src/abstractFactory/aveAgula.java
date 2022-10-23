package abstractFactory;

public class aveAgula extends Ave {

	public String especie = "Agula";
	public String alimentacao = "Peixes";
	public String cor = "Preta";
	@Override
	public String escritura() {
		// TODO Auto-generated method stub
		return "Animal: " + especie + "\nAlimentacao: " + alimentacao + "\nComportamento: " + comportamento + "\nColoracao: " + cor + "\n";
	}
	
}
