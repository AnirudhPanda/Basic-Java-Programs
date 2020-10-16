
class Time
{
	int hr,min,sec,day=0;
	Time(int hr1,int min1,int sec1)
	{
		hr=hr1;
		min=min1;
		sec=sec1;
	}
	void display()
	{
		System.out.println("Time is :"+day+" day "+hr+"Hour:"+min+"Minute:"+sec+"Second");
	}
	void calculate()
	{
		while(hr>24)
		{
			hr=hr-24;
			day++;
		}
		while(min>60)
		{
			min=min-60;
			hr++;
			while(hr>24)
			{
				hr=hr-24;
				day++;
			}
		}
		while(sec>60)
		{
			sec=sec-60;
			min++;
			while(min>60)
			{
				min=min-60;
				hr++;
				while(hr>24)
				{
					hr=hr-24;
					day++;
				}
			}
		}
	}
	void add(Time ob1,Time ob2)
	{
		hr= ob1.hr+ob2.hr;
		min=ob1.min+ob2.min;
		sec=ob1.sec+ob2.sec;
	
	}
}
public class TimeAdditionConstructor
{
	public static void main(String args[])
	{
		Time ob= new Time(45,22,60);
		Time ob1= new Time(26,13,77);
		ob.add(ob,ob1);
		ob.calculate();
		ob.display();	
	}
}