import java.util.Scanner;
class Play38
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
for(int i=2;i<=x;i++)
{
	if(x%i==0 && i%2==0)
	{
		System.out.print(i+" ");
	}
}
}
}