import java.util.Scanner;
class beg_41
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String x=sc.next();
int z=x.charAt(0);
if(z>=65 && z<=90 || z>=97 && z<=122)
{
	System.out.println("Alphabet");
}
else
{
	System.out.println("No");
}
}
}
