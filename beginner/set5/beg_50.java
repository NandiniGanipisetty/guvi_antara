
import java.util.Scanner;
 
class beg_50 {

  
    static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
         
        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
 
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	if(isPowerOfTwo(x))
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
    }
}