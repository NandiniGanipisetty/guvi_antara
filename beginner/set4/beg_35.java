import java.util.Scanner;
class beg_35
{
public static void main(String [] args)
{
int x=0,z=0,as=0;
Scanner sc=new Scanner(System.in);
String st=sc.nextLine();
for(int i=0;i<st.length();i++)
{
	z=st.charAt(i);
	as=(int)z;
	if(as >= 48 && as <= 57)
	{
		x++;
	}
}
System.out.println(x);
}
}
