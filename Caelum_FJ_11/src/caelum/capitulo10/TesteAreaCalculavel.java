package caelum.capitulo10;

public class TesteAreaCalculavel {

	public static void main(String[] args) {
		AreaCalculavel areaCalculavelRetangulo = new Retangulo(3, 2);
		System.out.println("Retangulo :" +areaCalculavelRetangulo.calculaArea());
		
		AreaCalculavel areaCalculavelCirculo = new Circulo(2);
		System.out.println("Circulo :" + areaCalculavelCirculo.calculaArea());
	}

}
