package business;

import java.util.List;

import javax.ejb.Local;

import beans.Forecast;

@Local
public interface WeatherBusinessInterface {
	public void test();
	public List<Forecast> getForecast();
	public void setForecast(List<Forecast> forecasts);
}
