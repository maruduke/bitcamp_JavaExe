package method;

public class problem {
	public static int max(int a, int b) {
		return a > b ? a: b;
	}
	public static int min(int a, int b) {
		return a > b ? b : a;
	}
	
	public static int minusAbs(int a, int b) {
		if (a-b>0) return a-b;
		else return b-a;
	}
	
	public static int totalSum(int a, int b) {
		int result = 0;
		
		for(int i = a; i<=b; i++) {
			result += i;
		}
		return result;
	}
	
	public static void gugudan(int a) {
		for(int i=1; i<=9; i++) {
			System.out.println( a +"x" + i + "=" + (a*i));
		}
	}
	
	public static void star(int a) {
		for(int i=0 ;i<a; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println( max(10,1) );
		System.out.println( minusAbs(10,1) );
		System.out.println( minusAbs(6,9) );
		System.out.println( totalSum(10,100) );
		gugudan(3);
		star(5);
		
	}
}
