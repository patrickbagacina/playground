package src;

import src.models.observers.*;
import src.models.subjects.WeatherData;

public class WeatherSimulator {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentConditions = new CurrentConditionsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(1, 2, 3);
        weatherData.setMeasurements(4, 5, 6);
        weatherData.setMeasurements(7, 8, 9);

        // removing subscription for current conditions observer
        currentConditions.remove();
        weatherData.setMeasurements(10, 11, 12);
    }
}