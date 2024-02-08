package resolve14.pb1;

public class printmain {

	public static void main(String[] args) {
		
	
		Printer pr = new InkPrinter("ink", "samsung", "USB", 0, 10, 30);
		Printer pr2 = new RayserPrinter("rayser", "lg", "USB", 0, 10, 15);

		pr.print();
		pr2.print();
	}

}
