package by.htp.task04.time;

import java.time.LocalTime;

public class Time {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	
	private int maxHour = 24;
	private int min = 0;
	private int max = 60;
	
	
	public Time(int hour, int minute, int second) {
		this.hour = validatorHour(hour);
		this.minute = validator(minute);
		this.second = validator(second);
	} 
	
	private int validator(int value) {
		if (value < min) {
			return 0;
		} else if (value > max) {
			return 0;
		} else {
			return value;
		}
	}

	private int validatorHour(int value) {
		if (value < min) {
			return 0;
		} else if (value > maxHour) {
			return 0;
		} else {
			return value;
		}
	}
	
	public void printer() {
		System.out.println(LocalTime.of(hour, minute, second));
	}
	
	public void setHour(int hour) {
		this.hour = validatorHour(hour);
	}
	
	public void setMinute(int minute) {
		this.minute = validator(minute);
	}
	
	public void setSecond(int second) {
		this.second = validator(second);
	}
	
	public static void main(String[] asas) {
		Time test = new Time(2,13,8);
		test.printer();
		test.setHour(25);
		test.printer();
	}
}
