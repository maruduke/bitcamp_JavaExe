package pb5;

public class Child {
	private int ballCount;
	
	public Child(int cnt){
		this.ballCount = cnt;
	}
	

	public void receive(int cnt) {
		this.ballCount += cnt;
	}
	

	public void given(Child child,int cnt) {
		this.ballCount -= cnt;
		child.receive(cnt);
	}
	
	
	public void show() {
		System.out.println("구슬 개수: " + ballCount);
	}
}
