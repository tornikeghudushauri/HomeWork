package ge.ufc.main;

public class Rectangle {

	private double length;
	private double width;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double fartobi() {
		return this.length * this.width;
	}

	public double perimetri() {
		return (this.length + this.width) * 2;
	}

}
