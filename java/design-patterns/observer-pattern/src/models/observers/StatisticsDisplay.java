package src.models.observers;

import src.models.subjects.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float temperature;
    private float min = 0;
    private float max = 0;

    public StatisticsDisplay(WeatherData d) {
        this.weatherData = d;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics Display: " + temperature + "F, " + min + " min, " + max + " max");
    }

    @Override
    public void remove() {
        weatherData.removeObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        if (temperature < min || min == 0)
            this.min = temperature;
        if (temperature > max || max == 0)
            this.max = temperature;

        display();
    }
}
