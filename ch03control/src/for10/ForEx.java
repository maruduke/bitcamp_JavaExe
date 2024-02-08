package for10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForEx {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		method2();
	}
	
	public static void method2() throws IOException{
		String input = br.readLine();
		int ans = 0;
		for(int i=0; i<input.length(); i++) {
			
			if(input.charAt(i) == '3' || input.charAt(i) == '6' || input.charAt(i) == '9') {
				ans += 1;
			}
		}
		if(ans == 2) {
			System.out.println("박수짝짝");
		}
		else if(ans ==1) {
			System.out.println("박수짝");
		}
	
	}
	
	public static void method11() throws IOException{		
	
		for(int i =1; i< 11; i++) {
			if( i % 2 == 0)
			System.out.println(i);
		}
		
	}
	
	public static void method12() throws IOException{		
		int input = Integer.parseInt(br.readLine());
		
		for(int i =0; i< input; i++) {
			System.out.println("감사합니다");
		}
		
	}
	
	public static void method13() throws IOException{		
		int input = Integer.parseInt(br.readLine());
		
		for(int i =1; i< input+1; i++) {
			System.out.print((3*i)+" ");
		}
		
	}
	
	public static void method14() throws IOException{
		int input = Integer.parseInt(br.readLine());
		
		for(int i =1; i< 10; i++) {
			System.out.println(input + " X " + i + " = " + (input*i));
		}
		
		
	}
	
	public static void method15() throws IOException{
		int answer = 0;
		int input = 0;
		while((input = Integer.parseInt(br.readLine())) != 0) {
			answer += input;
		}
		
		System.out.println(answer);
	}
}


