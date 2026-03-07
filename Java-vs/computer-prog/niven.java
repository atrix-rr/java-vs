import java.util.*;
class niven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 3-Digit number");
        int n=sc.nextInt();
        int H=n/100;
        int T=(n/10)%10;
        int O=n%10;
        int S=H+T+O;
        
        if(n%S==0)
        {
            System.out.println("Niven no.");
        }
        else
        {
            System.out.println("Not a Niven no.");
        }
    }
}