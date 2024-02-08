package resolve14.pb3;

import java.util.Random;

public class GeneratorThreeNum {
	Random random = new Random();
	
	public int[] run() {
		random.setSeed(System.currentTimeMillis());
		int[] response = new int[3];
		
		int i = 0;
		while(i<3) {
			int tmp = random.nextInt(9);
			
			boolean flag = true;
			for(int j = 0; j<i; j++) {
				if (response[j] == tmp) {
					flag = false;
					break;
				}
			}
			
			if(flag == true) {
				response[i] = tmp;
				i++;
			}
		}
		
		return response;
	}
}
