import java.util.Scanner;
class hun_9
{
   public static void main (String[] args)
   {
       Scanner sc=new Scanner(System.in);		
       int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";
	int l=sc.nextInt();
	int r=sc.nextInt();

       for (i = l; i <= r; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime no. between given range are :");
       System.out.println(primeNumbers);
   }
}