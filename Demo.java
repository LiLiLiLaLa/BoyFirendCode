//水果抽象接口
public interface Fruit {
	void get();
}

//水果工厂接口
public interface FruitFactory {
	//实例化Apple
	public Fruit getApple();
	
	//实例化Banana
	public Fruit getBanana();
}

//苹果抽象类
public abstract class Apple implements Fruit {
	@Override
	public abstract void get();
}

//香蕉抽象类
public abstract class Banana implements Fruit {
	@Override
	public abstract void get();
}


//北方苹果具体类
public class NorthApple extends Apple {
	public void get() {
		System.out.println("NorthApple");
	}
}

//南方香蕉具体类
public class NorthBanana extends Banana {
	public void get() {
		System.out.println("NorthBanana");
	}
}


//新增加的温室苹果
public class GreenhouseApple extends Apple {
	public void get() {
		System.out.println("GreenhouseApple");
	}
}

//新增的温室香蕉类
public class GreenhouseBanana extends Banana {
	public void get() {
		System.out.println("greenhouseBabanana");
	}
}

//南方苹果具体类
public class SouthApple extends Apple {
	public void get() {
		System.out.println("SouthApple");
	}
}

//北方香蕉具体类
public class NorthBanana extends Banana {
	public void get() {
		System.out.println("NorthBanana");
	}
}

//北方水果工厂类
public class NorthFruitFactory implements FruitFactory {
	public Fruit getApple() {
		return new NorthApple();
	}

	public Fruit getBanana() {
		return new NorthBanana();
	}
}

//南方水果工厂类
public class SouthFruitFactory implements FruitFactory {
	public Fruit getApple() {
		return new SouthApple();
	}
 
	public Fruit getBanana() {
		return new SouthBanana();
	}

}

//温室具体工厂类
public class GreenhouseFruitFactory implements FruitFactory {
	//返回GreenhouseApple
	public Fruit getApple() {
		return new GreenhouseApple();
	}
	//返回GreenhouseBanana
	public Fruit getBanana() {
		return new GreenhouseBanana();
	}
}

public class Demo{
	public static void main(String[] args) {
		FruitFactory northfruitFactory = new NorthFruitFactory();
		Fruit apple = northfruitFactory.getApple();
		Fruit banana = northfruitFactory.getBanana();
		apple.get();
		banana.get();
		System.out.println("---------------------------");
		FruitFactory southFruitFactory = new SouthFruitFactory();
		Fruit apple2 = southFruitFactory.getApple();
		Fruit banana2 = southFruitFactory.getBanana();
		apple2.get();
		banana2.get();
		
		System.out.println("--------------------------");
		GreenhouseFruitFactory greenhouseFruitFactory = new GreenhouseFruitFactory();
		Fruit apple3 = greenhouseFruitFactory.getApple();
		Fruit banana3 = greenhouseFruitFactory.getBanana();
		apple3.get();
		banana3.get();
	}
}
