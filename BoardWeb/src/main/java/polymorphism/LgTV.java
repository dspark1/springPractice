package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
//	@Autowired
//	@Qualifier("apple")
//	private Speaker speaker;

//	@Resource(name="apple")
//	private Speaker speaker;

	@Autowired
	private Speaker speaker;
	
	
	@Override
	public void powerOn() {
		System.out.println("LgTV turn On");
		
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV turn Off");
		
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
//		System.out.println("LgTV sound Up");
		
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
//		System.out.println("LgTV sound Down");
		
	}
}
