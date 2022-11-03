package observer;

public class CustomDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;

	private float pressure; //기압 가져오기


	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("평균/기압 상태:  온도 "+temperature+"%, 습도 "+pressure+"%");
	}
}
