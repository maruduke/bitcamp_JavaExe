package resolve14.pb1;

public abstract class Printer {
	private String model_name; // 모델명
	private String manufacture; // 제조사
	private String interface_port; // 인터페이스 종류(USB, paraller port
	private int copy_num; // 인쇄 매수
	protected int copy_remain_num; // 인쇄 종이 잔량
	
	public Printer(String model_name, String manufacture, String interface_port, int copy_num, int copy_remain_num) {
		this.model_name = model_name;
		this.manufacture = manufacture;
		this.interface_port = interface_port;
		this.copy_num = copy_num;
		this.copy_remain_num = copy_remain_num;
	}
	
	public void copy() {
		this.copy_remain_num -= copy_num;
	}
	

	public abstract void print();
}
