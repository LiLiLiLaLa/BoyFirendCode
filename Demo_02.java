//抽象产品类
abstract class Computer{
	public abstract void fun();
}

//具体产品类
class MacBookPro extends Computer {
	public void fun(){
		System.out.println("This is a MacBookPro!");
	}
}

//具体产品类
class SufeBook extends Computer{
	public void fun(){
		System.out.println("This is a SufeBookPro!");
	}
}

//抽象工厂接口
interface ComputerFactory {
	Computer createComputer();
}

//实现工厂接口的具体类
class AppleFactory implements ComputerFactory{

	public Computer createComputer(){
		return new MacBookPro();
	}
}

//实现工厂接口的具体类
class  MicrosoftFactory implements ComputerFactory{

	public Computer createComputer(){
		return new SufeBook();
	}
}

public class Demo{
	public static void main(String[] args) {
		ComputerFactory mf = new MicrosoftFactory();
		Computer mfc = mf.createComputer();
		mfc.fun();

		ComputerFactory apple = new AppleFactory();
		Computer mac = apple.createComputer();
		mac.fun();
	}
}