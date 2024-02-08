package resolve14.pb3;

import java.util.Scanner;

public class BaseBallMenu {

	private GeneratorThreeNum gtn;
	private DecisionBall db;
	private Scanner sc;
	BaseBallMenu() {
		gtn = new GeneratorThreeNum();
		db = new DecisionBall();
		sc = new Scanner(System.in);
	}
	
	public void run() {
		int[] res = gtn.run();
		
		for(int i=0; i<3; i++)
			System.out.println(res[i]);
		
		while(true) {
		int[] req = new int[3]; 
			System.out.print("첫번째 숫자 입력 >>> ");
			req[0] = sc.nextInt();
			System.out.print("두번째 숫자 입력 >>> ");
			req[1] = sc.nextInt();
			System.out.print("세번째 숫자 입력 >>> ");
			req[2] = sc.nextInt();
			int[] ans = db.run(res,req);
		
			System.out.println(ans[0] + "스트라이크 " + ans[1]+"볼");
			
			if(ans[0] == 3) {
				System.out.println("삼진 아웃");
				break;
			}
		}
	}
}
