import java.util.Scanner;
class beg_29
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the time in minutes :");
int min=sc.nextInt();
int hr=0,min1=0;
if(min>0)
{
if(min<60)
{
	min1=min;
}
else if(min>60)
{
	hr=min/60;
	min1=min%60;
}
System.out.println(hr+":"+min1);
}
else
{
System.out.println("invalid input\n");
}
}
}

 