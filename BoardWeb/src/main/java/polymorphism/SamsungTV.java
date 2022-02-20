package polymorphism;

public class SamsungTV implements TV, Speaker {
	
//	private SonySpeaker speaker;
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 按眉 积己");
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 按眉 积己");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 按眉 积己");
		this.speaker = speaker;
		this.price=price;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void initMethod() {
		System.out.println("===> SamsungTV 按眉 檬扁拳...");
	}
	public void powerOn() {
		System.out.println("SamsungTV Power On (啊拜 : " + price + ")");
	}
	public void powerOff() {
		System.out.println("SamsungTV power Off");
	}
	@Override
	public void volumeUp() {
		//	speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		//	speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}
