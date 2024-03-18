package ch08.ex01;

public class Audio implements RemoteControler {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int voluem) {
		if(volume > RemoteControler.MAX_VOLUME) {
			this.volume = RemoteControler.MAX_VOLUME;
		}else if(voluem < RemoteControler.MIN_VOLUME) {
			this.volume = RemoteControler.MIN_VOLUME;
		}else {
			this.volume = voluem;
		}
		
		System.out.println("현재 Audio볼륨: " + this.volume);
	}
}
