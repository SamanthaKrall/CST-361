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
public class WeatherBusinessService implements WeatherBusinessInterface {
	
	List<Forecast> forecasts = new ArrayList<Forecast>();
	
	@Override
	public void test() {
		System.out.println("Test Method");
	}

	@Override
	public List<Forecast> getForecast() {
		return forecasts;
	}

	@Override
	public void setForecast(List<Forecast> forecasts) {
		this.forecasts = forecasts;
		
	}
	
	public WeatherBusinessService() {
	
		forecasts.add(new Forecast("Monday", 36, 24, "Overcast"));
		forecasts.add(new Forecast("Tuesday", 38, 28, "Overcast"));
		forecasts.add(new Forecast("Wednesday", 40, 30, "Overcast"));
		forecasts.add(new Forecast("Thursday", 41, 39, "Rain and Snow mix"));
		forecasts.add(new Forecast("Friday", 47, 36, "Rainy"));
		forecasts.add(new Forecast("Saturday", 40, 27, "AM Showers"));
		forecasts.add(new Forecast("Sunday", 35, 27, "Partly Cloudy"));
	}
	
}
