package ProblemClass3;

public class Mart {
	private int totalMoney = 0;
	final int peer_price = 2500;
	
	public int peerSell(int money) {
		int numOfPeer = money / peer_price;
		this.totalMoney = money;
		return numOfPeer;
	}


}
