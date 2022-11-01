package src.models.observers;

import src.models.subjects.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float temperature;
    private float humidity;

    public ForecastDisplay(WeatherData d) {
        this.weatherData = d;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast Display: " + temperature + "F and " + humidity + " humidity");
    }

    @Override
    public void remove() {
        weatherData.removeObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();

        display();
    }
}
