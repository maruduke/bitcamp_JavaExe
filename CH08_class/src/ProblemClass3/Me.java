package ProblemClass3;

public class Me {
	private int money;
	private int peer = 0;
	
	Me(int money) {
		this.money = money;
	}
	public void buy(Mart mart, int money) {
		int peerNum = mart.peerSell(money);
		
		this.peer += peerNum;
		this.money -= money;
	
	}
}
