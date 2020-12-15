package caelum.capitulo14;

public class GuardadorDeObjetos {
	private Object[] arrayDeObjetos = new Object[250];
	private int posicao = 0;
	
	public void adicionarObjetos(Object object) {
		this.arrayDeObjetos[this.posicao] = object;
		this.posicao++;
	}
	
	public Object pegarObjetos(int indice) {
		return this.arrayDeObjetos[indice];
	}
}
