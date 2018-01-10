import java.io.Console;
class beg_8
{
public static void main(String [] args)
{
Console c=System.console();
int n=Integer.parseInt(c.readLine("enter range\n"));
int z=(n*(n+1))/2;
System.out.println(z);
}
}
