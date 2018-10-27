interface 基本事件{
	void 买口红();
}

class 顾客 implements 基本事件{
	public void 买口红(){
		System.out.println("买口红");
	}
}

class 代理 implements 基本事件{
	private 顾客 g;
	代理(顾客 g){
		this.g = g;
	}
	public void 选择货物(){
		System.out.println("选择口红");
	}
	public void 买口红(){
		选择货物();
		g.买口红();
		验收发货();
	}
	public void 验收发货(){
		System.out.println("验收发货");
	}
}
public class Demo{
	public static void main(String[] args){
		new 代理(new 顾客()).买口红();
	}
}