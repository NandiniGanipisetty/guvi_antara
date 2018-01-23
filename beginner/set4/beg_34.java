import java.util.Scanner;
class beg_34
{
public static void main(String [] args)
{
int x=0,z=0;
Scanner sc=new Scanner(System.in);
String st=sc.nextLine();
for(int i=0;i<st.length();i++)
{
	z=st.charAt(i);
	if((int)z==46)
	{
		x++;
	}
}
System.out.println(x+1);
}
}
