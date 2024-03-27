package pjava;

abstract class Quadrilateral {
	public Quadrilateral() {
		super();
		this.base = 0;
		this.height =0;
	}
	 public  abstract double area();
	public Quadrilateral(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	public int base;
	public int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
