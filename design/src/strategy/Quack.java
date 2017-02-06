package strategy;

/**
 * Created by Jeong on 2017-02-06.
 */
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("꿱꿱.");
	}
}
