package beans;

public class Forecast {
	String day = " ";
	int high;
	int low;
	String outlook;
	
	public Forecast(String day, int high, int low, String outlook) {
		this.day = day;
		this.high = high;
		this.low = low;
		this.outlook = outlook;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}

	public String getOutlook() {
		return outlook;
	}

	public void setOutlook(String outlook) {
		this.outlook = outlook;
	}
	
}
