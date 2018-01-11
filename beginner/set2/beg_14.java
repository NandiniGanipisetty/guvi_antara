import java.io.Console;
class beg_14
{
public static void main(String [] args)
{
Console c=System.console();
int x=Integer.parseInt(c.readLine("enter 1st no.\n"));
int y=Integer.parseInt(c.readLine("enter 2nd no.\n"));
for(int i=x+1;i<y;i++)
{
	if(i%2!=0)
	{
		System.out.print(i+" ");
	}
}
}
}