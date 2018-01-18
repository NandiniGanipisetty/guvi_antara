import java.util.Scanner;
class play_67
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int f=1;
if(n>=1 && n<=25)
{
	for(int i=1;i<=n;i++)
	{
		f=f*i;
	}
	System.out.println(f);
}
else
	System.out.println("invalid range of input!!\n");
}
}