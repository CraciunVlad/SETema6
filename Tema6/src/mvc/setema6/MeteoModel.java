package mvc.setema6;

import java.util.Random;

public class MeteoModel {

	private int temperatureRefreshValue;
	private int windSpeedRefreshValue;

	public void generateValues() {
		int minTemperature = -50;
		int maxTemperature = 65;
		int minSpeed = 0;
		int maxSpeed = 350;
		Random rand = new Random();
		int randomNum = rand.nextInt((maxTemperature - minTemperature) + 1)
				+ minTemperature;
		temperatureRefreshValue = randomNum;
		randomNum = rand.nextInt((maxSpeed - minSpeed) + 1) + minSpeed;
		windSpeedRefreshValue = randomNum;

	}

	public int getTemperatureRefreshValue() {
		return temperatureRefreshValue;
	}

	public int getWindSpeedRefreshValue() {
		return windSpeedRefreshValue;
	}

}
