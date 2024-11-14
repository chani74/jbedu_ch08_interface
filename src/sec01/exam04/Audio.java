package sec01.exam04;

public class Audio implements RemoteControl	 {

	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Turn on the Audio.");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off the Audio.");		
	}

	@Override
	public void setVolume(int volume) {
		if ( volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("now Audio volume : " + this.volume);	
	}
	

}
