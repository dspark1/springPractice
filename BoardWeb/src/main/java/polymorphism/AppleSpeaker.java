package polymorphism;

import org.springframework.stereotype.Component;

//@Component("apple")
public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("===> AppleSeaker ��ü ����");
	}
	public void volumeUp() {
		System.out.println("AppleSeaker volume Up");
	}
	public void volumeDown() {
		System.out.println("AppleSeaker volume Down");
	}
}
