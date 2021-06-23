package models;

public class Círculo {

	private int area;

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	

	@Override
	public String toString() {
		return "Círculo  de Area :" + area;
	}

	public Círculo(int area) {
		super();
		this.area = area;
	}
	
}
