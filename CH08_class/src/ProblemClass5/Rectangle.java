package ProblemClass5;

public class Rectangle {
	public int x1,y1,x2,y2;
	
	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public int square() {
		int require = (x2-x1)*(y2-y1);
		return require > 0 ? require : -require;
	}
	
	public void show() {
		System.out.printf("(%d, %d) ", x1,y1);
		System.out.printf("(%d, %d) ", x2,y2);
		System.out.printf("(%d, %d) ", x1,y2);
		System.out.printf("(%d, %d) ", x2,y1);
		System.out.println("넓이: " + square());
	}
	
	public boolean equals(Rectangle r) {
		if(!(x1 == r.x1 || x1 == r.x2))
			return false;
		if(!(x2 == r.x1 || x2 == r.x2))
			return false;
		if(!(y1 == r.y1 || y1 == r.y2))
			return false;
		if(!(y1 == r.y1 || y1 == r.y2))
			return false;
		
		return true;
	}
}
