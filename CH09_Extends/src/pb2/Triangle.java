package pb2;

public class Triangle {
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void setLength(int length) {
		this.width = length;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int dimention() {
		return (width*height) / 2;
	}
}
