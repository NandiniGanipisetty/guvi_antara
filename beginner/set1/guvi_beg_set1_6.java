import java.io.Console;
class guvi_beg_set1_6
{
public static void main(String [] args)
{
Console c=System.console();
int x=Integer.parseInt(c.readLine("enter the year\n"));
if(x%4==0)
{
	if(x%100==0)
	{
		if(x%400==0)
			System.out.printf("%d is a leap year",x);
		else
			System.out.printf("%d is not a leap year",x);
	}
	else
		System.out.printf("%d is a leap year",x);
}
else
	System.out.printf("%d is not a leap year",x);
}
}