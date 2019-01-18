package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Forecast;

@Stateless
@Local(WeatherBusinessInterface.class)
@Alternative
public class AnotherWeatherBusinessService implements WeatherBusinessInterface {
	
	List<Forecast> forecasts = new ArrayList<Forecast>();
	
	@Override
	public void test() {
		System.out.println("Test Method version 2");
	}

	@Override
	public List<Forecast> getForecast() {
		return forecasts;
	}

	@Override
	public void setForecast(List<Forecast> forecasts) {
		this.forecasts = forecasts;
		
	}
	
	public AnotherWeatherBusinessService() {
		
		forecasts.add(new Forecast("Monday", 72, 47, "Sunny"));
		forecasts.add(new Forecast("Tuesday", 64, 43, "Showers"));
		forecasts.add(new Forecast("Wednesday", 61, 41, "Mostly Sunny"));
		forecasts.add(new Forecast("Thursday", 60, 39, "Partly Cloudy"));
		forecasts.add(new Forecast("Friday", 59, 38, "Partly Cloudy"));
		forecasts.add(new Forecast("Saturday", 59, 38, "Sunny"));
		forecasts.add(new Forecast("Sunday", 61, 40, "Sunny"));
	}

}
