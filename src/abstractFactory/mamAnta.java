package abstractFactory;

public class mamAnta extends Mamifero {

	public String especie = "Anta";
	public int patas = 4;
	public String cauda = "Curta";
	@Override
	public String escritura() {
		// TODO Auto-generated method stub
		return "Animal: " + especie + "\nN. de Patas: " + patas + "\nVoz: " + voz + "\nTamanho da Cauda: " + cauda + "\n";
	}

	
}
