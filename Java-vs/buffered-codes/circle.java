import java.io.*;
class circle 
{
    public static void main(String[] args) throws IOException 
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the radius of the circle: ");
        double radius =Double.parseDouble(br.readLine());
        
        double area = Math.PI * radius * radius;
        
        System.out.println("Area of the circle is: " + area);
    }
}