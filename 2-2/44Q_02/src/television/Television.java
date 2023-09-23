package television;
public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	public Television(int channel, int volume, boolean onOff) {
		this.channel = channel;	this.volume = volume;	this.onOff = onOff;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isOnOff() {
		return onOff;
	}
}
