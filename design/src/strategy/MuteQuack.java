package strategy;

/**
 * Created by Jeong on 2017-02-06.
 */
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack(){
		System.out.println("조용.");
	}
}
