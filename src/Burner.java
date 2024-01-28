public class Burner {
	public enum Temperature {
		BLAZING, HOT, WARM, COLD
	}
	
	public Temperature myTemperature;

	public Temperature getTemperature() {
		return myTemperature;
	}
	
	public Setting mySetting;
	
	private int timer;
	public static final int TIME_DURATION = 2;

	public Burner() {
		myTemperature = Temperature.COLD;
		mySetting = Setting.OFF;
	}
	
	public void plusButton() {
		switch (mySetting) {
		case OFF:
			mySetting = Setting.LOW;
			break;
		case LOW:
			mySetting = Setting.MEDIUM;
			break;
		case MEDIUM:
			mySetting = Setting.HIGH;
		case HIGH:
			break;
		}
		timer = TIME_DURATION;
	}
	
	public void minusButton() {
		switch(mySetting) {
		case OFF:
			break;
		case LOW:
			mySetting = Setting.OFF;
			break;
		case MEDIUM:
			mySetting = Setting.LOW;
			break;
		case HIGH:
			mySetting = Setting.MEDIUM;
			break;
		}
	}
	
	public void updateTemperature() {
		if (timer > 0) {
			timer--;
		}
		
		if (timer == 0) {
			switch (mySetting) {
			case OFF:
				myTemperature = Temperature.COLD;
				break;
			case LOW:
				myTemperature = Temperature.WARM;
				break;
			case MEDIUM:
				myTemperature = Temperature.HOT;
				break;
			case HIGH:
				myTemperature = Temperature.BLAZING;
				break;
		}
	}
}
	
	public void display() {
		String tempMessage = "";
		
		switch (myTemperature) {
		case BLAZING:
			tempMessage = "VERY HOT! DON'T TOUCH";
			break;
		case HOT:
			tempMessage = "CAREFUL";
			break;
		case WARM:
			tempMessage = "warm";
			break;
		case COLD:
			tempMessage = "cooool";
			break;
	}
		System.out.println("[" + mySetting + "]....." + tempMessage);
}
}
