package resolve14.pb1;

public class RayserPrinter extends Printer{
	
	private int toner; // 토너 잔량
	public RayserPrinter(String model_name, String manufacture, String interface_port, int copy_num,
			int copy_remain_num, int toner) {
		super(model_name, manufacture, interface_port, copy_num, copy_remain_num);
		this.toner = toner;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
	
		System.out.println("Rayser 출력");
		copy();
		toner -= 1;
		System.out.println("남은 용지 수:" + copy_remain_num);
		System.out.println("남은 토너 수량:" + toner);
		
		
	}

}
