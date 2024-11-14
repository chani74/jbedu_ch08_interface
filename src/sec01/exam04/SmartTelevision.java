package sec01.exam04;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
		
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println("search to : " + url);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Turn on the TV.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Turn off the TV.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if ( volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("now volume : " + this.volume);
	}

}
