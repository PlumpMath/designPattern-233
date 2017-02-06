package observer;

/**
 * Created by Jeong on 2017-02-06.
 */
public class WeatherStation {
	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();

		CurrentConditions currentConditions = new CurrentConditions(weatherData);

		/*StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);*/

		weatherData.setMeasurementsChanged(85, 62, 36.7f);
	}
}
