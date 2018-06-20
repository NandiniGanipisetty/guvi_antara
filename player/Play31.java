import java.util.Scanner;
class Play31
{
public static void main(String [] args)
{
int c1=0,c2=0;
Scanner sc=new Scanner(System.in);
String st=sc.next();
int l=st.length();
for(int i=0;i<l;i++)
{
	if(st.charAt(i)=='(')
	{
		c1++;
	}
	else
	{
		c2++;
	}
}
if(c1==c2)
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
}
}
}