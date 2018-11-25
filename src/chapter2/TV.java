package chapter2;

public class TV {
	private boolean power;
	private int channel;
	private int volume;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void channel(int channel) {
		if(!power) {
			return;
		}		
		this.channel = channel;
	}
	
	public void channel(boolean up) {
		channel(channel + (up ? 1 : -1));
	}

	public void volume(int volume) {
		if(!power) {
			return;
		}
		this.volume = volume;
	}
	
	public void volume(boolean up) {
		volume(volume + (up ? 1 : -1));
	}
	
	public void power(boolean on) {
		power = on;
	}
	
	public void status() {
		System.out.println(
			"TV[power=" + power + 
			",channel=" + channel + 
			", volume=" + volume + "]");
	}
}
