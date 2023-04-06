import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MP2 {
	
	static device deviceObj = new device();
	static deviceLogic logicObj = new deviceLogic();
	static Scanner inputDevice = new Scanner(System.in);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean loopOn = true;
		int userChoice;
		int i = 0;
		deviceObj.addDefaultDevices();
		do
		{
		logicObj.printMenu();
		userChoice = Integer.parseInt(inputDevice.nextLine());
		
		switch (userChoice)
		{
		case 1: 
				logicObj.printOption1();
				logicObj.enterContinue();
				inputDevice.nextLine();
				break;
		
		case 2: logicObj.printOption2();
				deviceObj.devices.add(new device(logicObj.A.toUpperCase(), logicObj.B, true));
				logicObj.enterContinue();
				inputDevice.nextLine();
				break;
//				
		case 3: logicObj.printOption3();
				deviceObj.devices.set(logicObj.C, deviceObj.editdevices.get(0));
				logicObj.clearOption3List();
				logicObj.enterContinue();
				inputDevice.nextLine();
				break;
				
		case 4 :logicObj.printOption4();
				logicObj.enterContinue();
				inputDevice.nextLine();
				break;
		case 5: logicObj.printOption5();
				logicObj.enterContinue();
				inputDevice.nextLine();
				break;
		case 6: logicObj.printOption6();
				logicObj.enterContinue();
				inputDevice.nextLine();
				break;
				
		case 7: System.out.print("Good Bye!");
				return;
				
		
		}
		
		} while(loopOn == true);

		
	}

}
