package strategy;

/**
 * Created by Jeong on 2017-02-06.
 */
public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly(){
		System.out.println("날지못해요.");
	}
}
