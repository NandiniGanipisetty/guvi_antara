import java.util.Scanner;
class beg_17
{
public static void main(String args[])
{
int rem,p=0,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int x=sc.nextInt();
temp=x;
while(temp!=0)
{
rem=temp%10;
p=p + rem*rem*rem;
temp=temp/10;
}
if(x==p)
{
System.out.println("armstrong number");
}
else
{
System.out.println("not an armstrong number");
}
}
}
