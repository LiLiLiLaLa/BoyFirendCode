import java.util.Scanner;

abstract class Computer{
	public abstract void fun();
}


class SufeBook extends Computer{
	public void fun(){
		System.out.println("This is SufeBook");
	}
}

class MacBookPro extends Computer{
	public void fun(){
		System.out.println("This is MacBookPro");
	}
}

class ComputerFactory{
	private ComputerFactory(){}
	public static Computer getComuter(String pcType){
		Computer ret = null;
		if(pcType.equals("mac")){
			ret = new MacBookPro();
		}else if(pcType.equals("sufe")){
			ret = new SufeBook();
		}
		return ret;
	}
}



public class Demo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入笔记本");
		Computer  ret = ComputerFactory.getComuter(sc.next());
		ret.fun();
	}
}