import java.util.*;
class EvenOddChecker
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int A=sc.nextInt();
        
        if(A%2==0)
        {
            System.out.println("Even no.");
        }
        else
        {
            System.out.println("Odd no.");
        }
    }
}