package resolve14.pb1;

public class InkPrinter extends Printer{

	private int remain_ink; // 잉크 잔량
	public InkPrinter(String model_name, String manufacture, String interface_port, int copy_num, int copy_remain_num
			,int remain_ink) {
		super(model_name, manufacture, interface_port, copy_num, copy_remain_num);
		// TODO Auto-generated constructor stub
		
		this.remain_ink = remain_ink;
	}
	
	
	@Override
	public void print() {
		System.out.println("ink printer 출력");
		copy();
		this.remain_ink -= 1;
		
		System.out.print("남은 용지 수: " + copy_remain_num);
		System.out.println("남은 잉크:" + remain_ink);
	}

}
