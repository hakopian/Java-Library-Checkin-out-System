import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class deviceLogic {
	device deviceObj = new device();
	Scanner inputDevice = new Scanner(System.in);
	String A;
	String B;
	int C;

	public deviceLogic()
	{
		
	}
	// prints the menu
	public static void printMenu()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\t\tLibrary Device Checkout System\n");
		System.out.println("1. List Devices by Title");
		System.out.println("2. Add New Devices");
		System.out.println("3. Edit Device Information");
		System.out.println("4. Search by Device Name");
		System.out.println("5. Check Out Devices");
		System.out.println("6. Check In Devices");
		System.out.println("7. Exit");
		System.out.println("\n\nSelect menu option 1-7: ");
	}
	// prints the list to the user
	public void printOption1()
	{
		System.out.print("\t\tLibrary Device Checkout System - List\n\n");
		System.out.print("  # SKU        Name\n");
		int i = 1;
		for (device stuff: device.devices)
			System.out.printf("  %d "+stuff+"\n", i++);
		System.out.println("\n");
		
	}
	// adds new device to the list
	public void printOption2()
	{
		System.out.println("\n\n\n\n\n\n\n\t\tLibrary Device Checkout System - Add New Device\n");
		System.out.print("Sku: ");
		A =inputDevice.nextLine();
		System.out.print("Name: ");
		B =inputDevice.nextLine();
		System.out.printf("\nAdded %s to the Catalog.\n", B);
	}
	// edits a device within the list
	public void printOption3()
	{
		System.out.print("\t\tLibrary Device Checkout System - List\n\n");
		System.out.print("  # SKU        Name\n");
		int i = 1;
		for (device stuff: device.devices)
			System.out.printf("  %d "+stuff+"\n", i++);
		System.out.printf("\n\n Enter Device number to edit (1-%d): \n\n\n",i-1);
		C = Integer.parseInt(inputDevice.nextLine()) -1;
		System.out.print("Sku: ");
		A =inputDevice.nextLine();
		System.out.print("Name: ");
		deviceObj.editdevices.add(new device(A.toUpperCase(), inputDevice.nextLine(), true));
		
		System.out.println("\nDevice Information Updated\n");
//		deviceObj.editdevices.remove(0);
	}
	// searches the list for a specific device/devices
	public void printOption4()
	{
		System.out.println("\t\tLibrary Device Checkout System - List\n\n");
		System.out.print("Enter a Device to search for: ");
		A = inputDevice.nextLine();
		System.out.printf("\n\nListings for '%s' \n", A);
		System.out.print("# SKU        Name\n");
		int i = 0;
		int e = 1;
	    for (device stuff: deviceObj.devices)
	        if (stuff.toString().toLowerCase().contains(A) == true)
	        {
	            System.out.printf("%d %s\n", e, stuff);
	            i++;
	            e++;
	        }
	    System.out.println();
		
	}
	// checkouts device, but searched through SKU and not device number. Sorry I was running out of time for this assignment.
	public void printOption5()
	{
		System.out.println("\t\tLibrary Device Checkout System - Check Out Device\n\n");
		System.out.print("# SKU        Name\n");
		int i = 1;
	    for (device stuff: deviceObj.devices)
	        if (stuff.toString().contains("Available") == true)
	        {
	            System.out.printf("%d %s\n", i, stuff);
	            i++;
	        }
	    System.out.println();
		System.out.println("Enter device SKU number to checkout: ");
		A = inputDevice.nextLine().toUpperCase();
	    for (device stuff: deviceObj.devices)
	        if (stuff.toString().contains(A.toUpperCase()) == true)
	        {
	            stuff.setStatusCheckedOut();

	        }
	    System.out.println("Device Checked Out.\n");
	}
	// checks in the device.
	public void printOption6()
	{
		System.out.println("\t\tLibrary Device Checkout System - Check In Device\n\n");
		System.out.print("# SKU        Name\n");
		int i = 1;
	    for (device stuff: deviceObj.devices)
	        if (stuff.toString().contains("Checked out") == true)
	        {
	            System.out.printf("%d %s\n", i, stuff);
	            i++;
	        }
	    System.out.println();
		System.out.print("Enter device SKU number to check in: ");
		A = inputDevice.nextLine().toUpperCase();
	    for (device stuff: deviceObj.devices)
	        if (stuff.toString().contains(A.toUpperCase()) == true)
	        {
	            stuff.setStatusCheckedIn();

	        }
	    System.out.println("Device Checked In.");
	}
	
	
	public void clearOption3List()
	{
		deviceObj.editdevices.remove(0);
	}
	
	public void enterContinue()
	{
		System.out.print("Press Enter to continue...\n\n");
	}
	
	
}
