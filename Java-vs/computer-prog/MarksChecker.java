import java.util.*;
class MarksChecker
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks");
        int M=sc.nextInt();
        
        if(M>=0 && M<=100)
        {
            System.out.println("Marks are Valid");
        }
        else
        {
            System.out.println("Marks are Invalid");
        }
    }
}