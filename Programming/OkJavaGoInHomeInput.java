import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeInput {

	// parameter, 매개변수
	public static void main(String[] args) {
		
//		String id = JOptionPane.showInputDialog("Enter a ID");
//		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		
		String id = args[0];
		String bright = args[1];
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + " / moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();

	}

}

/*
 * 출처
 * 생활코딩, "JAVA1 - 11.1. 입력과 출력", https://www.youtube.com/watch?v=-xllzUahaFQ&t=44s
 * 생활코딩, "JAVA1 - 11.2. 입력과 출력 : arguments & parameter", https://www.youtube.com/watch?v=66S529MuxpY&t=604s
 */