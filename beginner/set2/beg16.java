import java.io.Console;
public class beg16 {

    public static void main(String[] args) {
Console c=System.console();
        int low = Integer.parseInt(c.readLine("enter 1st number\n"));
	int high=Integer.parseInt(c.readLine("enter 1st number\n"));

        while (low < high) {
            boolean flag = false;
	if(low==1){
			flag=true;
		}

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(low + " ");

            ++low;
        }
    }
}