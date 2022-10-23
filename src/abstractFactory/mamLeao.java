package abstractFactory;

public class mamLeao extends Mamifero {
	
	public String especie = "Leão";
	public int patas = 4;
	public String voz = "Rugido";
	public String cauda = "Longa";
	@Override
	public String escritura() {
		// TODO Auto-generated method stub
		return "Animal: " + especie + "\nN. de Patas: " + patas + "\nVoz: " + voz + "\nTamanho da Cauda: " + cauda + "\n";
	}

}
