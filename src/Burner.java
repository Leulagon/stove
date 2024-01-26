public class Burner {
	public enum Temperature {
		BLAZING, HOT, WARM, COLD
	}
	
	Temperature temperature;

	public Temperature getTemperature() {
		return temperature;
	}
	
	Setting mySetting;
	
	int timer;
	public static final int TIME_DURATION = 2;
	
}
