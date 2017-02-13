class Time
{
	private int sec,st;
	private int min;
	private int hr;
	private int temp;

	
	public Time()
	{
		sec=0;
		min=0;
		hr=0;
	}

	public Time(int h,int m,int s)
	{
		sec= s;
		min= m;
		hr= h;
	}
	
	public Time(Time tm)
	{
		sec= tm.sec;
		min= tm.min;
		hr= tm.hr;

	}

	public Time(int s)
	{	
		int tems;
		temp = s;
		tems = s;
		hr = s/3600;
		tems = s%3600;
		min = tems/60;
		sec= tems%60;

	}

	public void tprint()
	{
	System.out.println(""+hr+":"+min+":"+sec);
	}

	public void incr(int s)
	{
		int tems;
		
		s = s + temp;
		hr = s/3600;
		tems = s%3600;
		min = tems/60;
		sec= tems%60;

	}
	

	public static void diff(Time t1,Time t2)
	{
		Time t3 = new Time();

		int s,tems;
		int total;
		int ss,mm,hh;
		
		t3.temp = t1.temp - t2.temp;

		s = t3.temp;
		tems = s;
		t3.hr = s/3600;
		tems = s%3600;
		t3.min = tems/60;
		t3.sec= tems%60;
		System.out.println("Difference is : ");
		t3.tprint();


	}



	public void ptotal()
	{
	System.out.println("Total no. of seconds :"+st);
	}
}








public class Class1
{
	public static void main(String args[])
	{
		
		Time t1 = new Time(7223);
		Time t2 = new Time(3633);
		
		t1.tprint();
		t2.tprint();
		t1.incr(95);
		t1.tprint();

		t1.diff(t1,t2);
		

	}
}
		
























