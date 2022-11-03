package observer;

public class WeatherApplication {

		public static void main(String[] args) {
			WeatherData weatherData = new WeatherData();
			Observer currentConditionsDisplay = new CurrentConditionsDisplay();
			Observer customDisplay = new CustomDisplay();


			weatherData.registerObserver(currentConditionsDisplay);
			weatherData.setWeatherData(3, 5, 7);

			System.out.println("Custom 디스플레이를 추가합니다.");
			weatherData.registerObserver(customDisplay);

			System.out.println("기상 데이터가 변경 됩니다.");
			weatherData.setWeatherData(20, 30, 80);

			System.out.println("Current 디스플레이를 제거합니다.");
			weatherData.removeObserver(currentConditionsDisplay);
			weatherData.setWeatherData(25, 30, 80);

		}

}
