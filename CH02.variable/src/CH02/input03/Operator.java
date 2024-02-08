package CH02.input03;

import java.util.Scanner;

public class Operator {
 public static void main(String[] args) {
	int result = 0;
	int num0 = 0, num1 = 0;
	
	Scanner sc = new Scanner(System.in);
	num0 = sc.nextInt();
	num1 = sc.nextInt();
	
	System.out.println(num0+num1);
	sc.close();
 }
}
