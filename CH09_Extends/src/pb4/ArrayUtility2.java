package pb4;

public class ArrayUtility2 {
	public static int[] concat(int[] s1, int[] s2) {
		int[] response = new int[s1.length+s2.length];
		
		for(int i = 0; i<s1.length; i++) {
			response[i] = s1[i];
		}
		
		for(int i = 0; i<s2.length; i++) {
			response[i+s1.length] = s2[i];
		}
		
		return response;
	}
	
	public static int[] remove(int[] s1, int[] s2) {
		int cnt = 0;
		int[] tmp = new int[s1.length];
		boolean flag = true;
		
		for(int i=0; i< s1.length; i++) {
			for(int j=0; j<s2.length; j++) {
				if(s1[i] == s2[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag==true) {
				tmp[cnt] = s1[i];
				cnt += 1;
			}
			flag = true;
		}
		
		int[] response = new int[cnt];
		for(int i=0; i<cnt; i++) {
			response[i] = tmp[i];
		}
		
		return response;
	}
}
