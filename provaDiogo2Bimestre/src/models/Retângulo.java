package models;

public class Retângulo {
	
	private int altura;
	private int largura;
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	@Override
	public String toString() {
		return "Retângulo de + Altura :" + altura + ",e Largura :" + largura ;
	}
	public Retângulo(int altura, int largura) {
		super();
		this.altura = altura;
		this.largura = largura;
	}
	public Retângulo() {
		// TODO Auto-generated constructor stub
	}
	
	
}


