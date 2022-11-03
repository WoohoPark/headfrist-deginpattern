package strategy;

public class MachineQuack implements  QuackBehavior{
	@Override
	public void quack() {
		System.out.println("기계 오리음");
	}
}
