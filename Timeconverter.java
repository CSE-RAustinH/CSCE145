//Austin Harrelson
public class Timeconverter {

	//Instance Variables
	private int hours;
	private int minutes;
	private int seconds;
	private boolean notPM;
	
	// Default Constructor
	public Timeconverter()
	{
		hours = 0;
		minutes = 0;
		seconds = 0;
		notPM = true;
	}
	
	// Parameterized Constructor
	public Timeconverter(int xHours, int xMinutes, int xSeconds)
	{
		this.setHours(xHours);
		this.setMinutes(xMinutes);
		this.setSeconds(xSeconds);
	}

	// Accesors 
	public int getHours()
	{
		return this.hours;
	}
	
	public int getMinutes()
	{
		return this.minutes;
	}
	
	public int getSeconds()
	{
		return this.seconds;
	}
	
	public boolean getnotPM()
	{
		return this.notPM;
	}
	
	
	// Mutators
	public void setHours(int xHours) {
		
		if(xHours >= 0 && xHours <=24)
		{
			this.hours = xHours;
		}
		else
		{
			System.out.println("Invalid Value Entered!");
		}
	}

	public void setMinutes(int xMinutes) {
		
		if(xMinutes >= 0 && xMinutes <= 59)
		{
			this.minutes = xMinutes;
		}
		else
		{
			System.out.println("Invalid Value Entered!");
		}
		
	}

	public void setSeconds(int xSeconds) {
		if(xSeconds >= 0 && xSeconds <= 59)
		{
			this.seconds = xSeconds;
		}
		else
		{
			System.out.println("Invalid Value Entered!");
		}
	}
	
	public void setnotPM(int xHours)
	{
		if(xHours >= 12 && xHours <=23)
		{
			notPM = false;
		}
		else if(xHours >= 0 && xHours <=11)
		{
			notPM = true;
		}
		else
		{
			System.out.println("Invalid Value Entered!");
		}
	}
	
	// Methods
	
	//Change time 1
	
	public void updateTime(int xHours, int xMinutes, int xSeconds) throws TimeException
	{
		if(xHours >=0 && xHours<= 24)
		{
			if(xHours > 0 && xHours < 12)
			{
				this.hours = xHours;
				notPM = true;
			}
			else if(xHours == 12)
			{
				this.hours = xHours;
				notPM = false;
			}
			else if(xHours > 12 && xHours < 24)
			{
				this.hours = xHours - 12;
				notPM = false;
			}
			else if(xHours == 0)
			{
				xHours = 12;
			}
		}
		else
		{
			throw new TimeException();
		}
			
		this.setHours(xHours);
		this.setMinutes(xMinutes);
		this.setSeconds(xSeconds);
	}
	
	//Change time 2
	
	public void updateTime(String time) throws TimeException
	{
		String hour = time.substring(0,2);
		String minutes = time.substring(3,5);
		String seconds = time.substring(6,8);
		
	//Temporary Valuables
		
		int tempHour = 0;
		int tempMin = 0;
		int tempSec = 0;
		
		try {
			tempHour = Integer.parseInt(hour);
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
		try {
			tempMin = Integer.parseInt(minutes);
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
		try {
			tempSec = Integer.parseInt(seconds);
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
	
		
		if(tempHour >= 0 && tempHour <= 24)
		{
			if(tempHour > 0 && tempHour < 12)
			{
				this.hours = tempHour;
				notPM = true;
			}
			else if(tempHour == 12)
			{
				this.hours = tempHour;
				notPM = false;
			}
			else if(tempHour > 12 && tempHour < 24)
			{
				this.hours = tempHour - 12;
				notPM = false;
			}
			else if(tempHour == 0)
			{
				tempHour = 12;
			}
		}
		else
		{
			throw new TimeException();
		}
		
		this.setMinutes(tempMin);
		this.setSeconds(tempSec);
		
	}
	
	
	public void displayTime()
	{
		String min;
		String sec;
		
		if(this.minutes < 10)
		{
			min = "0" + this.minutes;
		}
		else
		{
			min = "" + this.minutes;
		}
		
		if(this.seconds < 10)
		{
			sec = "0" + this.seconds;
		}
		else
		{
			sec = "" + this.seconds;
		}
		
		System.out.print(this.hours + ":" + min + ":" + sec + " ");
		
		
		if(notPM = true)
		{
			System.out.print("PM");
		}
		else
		{
			System.out.print("AM");
		}
		
			System.out.println();
			
	}
	
	
	
	
}
