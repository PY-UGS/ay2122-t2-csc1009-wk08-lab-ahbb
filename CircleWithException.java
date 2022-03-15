import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleWithException
{   
    private static final double PI = 3.14;
    private double radius;

    public double getRadius() 
    {
        return this.radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;

        //<0 is not a default exception
        if (radius<=0)
        {
            throw new IllegalArgumentException();
        }
    }

    public double getDiameter(double radius)
    {
        return radius*2;
    }

    public double getArea(double radius) throws Exception
    {
        double area = PI*radius*radius;

         //>1000 is not a default exception
        if (area>1000)
        {
            throw new Exception();
        }
        return area;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        CircleWithException circle = new CircleWithException();
        double area=0.0;
        
        try
        {
            System.out.println("Enter radius of circle: ");
            circle.setRadius(input.nextDouble());
            area = circle.getArea(circle.getRadius()); 
            System.out.println("Area of circle is "+area);
        }

        catch(IllegalArgumentException e)
        {
            System.out.println("Radius cannot be less or equals to 0.");
        }

        catch(InputMismatchException e)
        {
            System.out.println("Radius cannot be a non-number.");
        }

        catch(Exception e)
        {
            System.out.println("Area is more than 1000.");
        }

        input.close();
      
    }
}