import java.util.ArrayList;



public class device {
	private String sku;
	private String name;
	private boolean available;
	static ArrayList<device> devices = new ArrayList<device>();
	static ArrayList<device> editdevices = new ArrayList<device>();
	
	public device()
	{
		
	}
	
	public device(String sku, String name, boolean isAvailable) 
	{
        this.sku = sku; 
        this.name = name;
        this.available = isAvailable;
    }
	
	public String getStatusString() {
		
        return available ? "Available" : "Checked out";
    }
	
	public void setStatusCheckedOut()
	{
		available = false;
	}
	
	public void setStatusCheckedIn()
	{
		available = true;
	}
  
    public String toString() 
    {
        return String.format("%-10s %-30s\t\t %s", this.sku, this.name, this.getStatusString());
    }
   
    
    public void addDefaultDevices()
	{
		devices.add(new device("6767A", "Apple 9.7-Inch iPad Pro", true));
		devices.add(new device("93P51B", "Amazon Kindle Fire Kids Edition", true));
		devices.add(new device("10N8C", "LeapFrog Epic Learning Tablet", true));
		devices.add(new device("85U20", "Amazon Kindle Fire HD 8", false));
		devices.add(new device("91H2D", "HP Envy Note 8", true));
		
	}
    
	

	public void setDeviceSku(String param1)
	{
		sku = param1;
	}
	
	public String getDeviceSku()
	{
		return(sku);
	}
	
	public void setDeviceName(String param1)
	{
		name = param1;
	}
	
	public String getDeviceName()
	{
		return(name);
	}
	




}
