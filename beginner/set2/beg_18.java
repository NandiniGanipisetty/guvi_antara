import java.util.Scanner;
class beg_18
{
public static void main(String args[])
{
int rem,p=0,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st number");
int x=sc.nextInt();
System.out.println("enter 2nd number");
int y=sc.nextInt();
for(int i=x+1;i<y;i++)
{
temp=i;
while(temp!=0)
{
rem=temp%10;
p=p + rem*rem*rem;
temp=temp/10;
}
if(i==p)
{
System.out.print(i+" ");
}
p=0;
}
}
}