package resolve14.pb3;

public class DecisionBall {
	int[] create_ball;
	int[] input_ball;
	
	public void setBall(int[] create_ball, int[] input_ball) {
		this.create_ball = create_ball;
		this.input_ball = input_ball;
	}
	
	public int[] run(int[] create_ball, int[] input_ball) {
		int strike = 0;
		int ball = 0;
		
		for(int i = 0; i<create_ball.length; i++) {
			for(int j = 0; j<input_ball.length; j++) {
				if(create_ball[i] == input_ball[j]) {
					if ( i== j)
						strike += 1;
					else
						ball += 1;
					break;
				}
			}
		}
		
		return new int[] {strike, ball};
	}
}
