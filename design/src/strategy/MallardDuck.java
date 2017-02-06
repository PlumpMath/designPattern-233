package strategy;

/**
 * Created by Jeong on 2017-02-06.
 */
public class MallardDuck extends Duck{

	public MallardDuck () {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("청둥오리 입니다.");
	}
}

