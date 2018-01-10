import java.util.Scanner;
class beg_11
{
public static void main(String args[])
{
int p=1;
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
for(int i=0;i<y;i++)
{
	p=p*x;	
}
System.out.println(p);
}
}
