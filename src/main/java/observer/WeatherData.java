package observer;


import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private float temperature;
	private float humidity;
	private float pressure;
	private List<Observer> observers;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(temperature, humidity, pressure);
		}

	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setWeatherData(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return this.temperature;
	}

	public float getHumidity() {
		return this.humidity;
	}

	public float getPressure() {
		return this.pressure;
	}
}
