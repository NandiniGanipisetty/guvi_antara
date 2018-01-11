import java.util.Scanner;
class beg_21
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=sc.nextInt();
int d=sc.nextInt();
float l=0,s=0;
l=a+(n-1)*d;
s=(n/2f)*(a+l);
System.out.println(s);
}
}
