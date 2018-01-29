import java.util.Scanner;
class beg_42
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
int x=0,y=0;
char c1=s1.charAt(0);
char c2=s2.charAt(0);
x=(int)c1;
y=(int)c2;
if(x>y)
{
	System.out.println(s1);
}
else
{
	System.out.println(s2);
}
}
}
