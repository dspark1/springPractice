package polymorphism;

import org.springframework.stereotype.Component;

//@Component("apple")
public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("===> AppleSeaker °´Ã¼ »ý¼º");
	}
	public void volumeUp() {
		System.out.println("AppleSeaker volume Up");
	}
	public void volumeDown() {
		System.out.println("AppleSeaker volume Down");
	}
}
