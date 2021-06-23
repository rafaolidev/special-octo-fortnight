package models;

public class Triangulo {
	
	private int altura;
	private int base;
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	@Override
	public String toString() {
		return "Triangulo de Altura :" + altura + ",e Base :" + base;
	}
	public Triangulo(int altura, int base) {
		super();
		this.altura = altura;
		this.base = base;
	}
	
	
}

