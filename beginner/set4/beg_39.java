import java.util.Scanner;
class beg_39
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int []a=new int[10];
for(int i=0;i<10;i++)
{
	a[i]=sc.nextInt();
}
int max=0;
max=a[0];
for(int i=1;i<10;i++)
{
	if(max < a[i])
	{
		max=a[i];
	}
}
System.out.println("\n"+max);
}
}
