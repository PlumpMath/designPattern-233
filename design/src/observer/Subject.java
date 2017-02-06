package observer;

/**
 * Created by Jeong on 2017-02-06.
 */
public interface Subject {

	void registerobserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();

}
