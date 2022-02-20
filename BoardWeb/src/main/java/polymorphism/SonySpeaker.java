package polymorphism;

import org.springframework.stereotype.Component;

//@Component("sony")
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("===> SonySeaker °´Ã¼ »ý¼º");
	}
	public void volumeUp() {
		System.out.println("SonySeaker volume Up");
	}
	public void volumeDown() {
		System.out.println("SonySeaker volume Down");
	}
}
