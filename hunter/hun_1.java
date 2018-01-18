import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuilder;
class hun_1
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
String st=sc.nextLine();
StringBuilder sb=new StringBuilder(st);
sb.reverse();
String x=sb.toString();
System.out.println("reverse : "+x);
}
}
