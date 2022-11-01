package src.models.observers;

import src.models.subjects.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(WeatherData d) {
        weatherData = d;
        weatherData.addObserver(this);
    }

    @Override
    public void remove() {
        weatherData.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println(
                "Current condition: " + temperature + "F, " + humidity + " humidity, " + pressure + " pressure");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();

        display();
    }
}
