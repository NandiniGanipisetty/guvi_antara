import java.util.Scanner;
class Play39
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x;
for(int i=0;i<=n/2;i++)
{
	x=(int)Math.pow(2,i);
	if(x==n)
	{
		System.out.println("yes");
		break;
	}	
	else
	{
		continue;
	}
break;
}
System.out.println("no");
}
}