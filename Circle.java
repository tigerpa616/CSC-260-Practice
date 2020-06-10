import java.util.Scanner;

public class Circle
{
    double radius = 1.0;

    public static double setRadius(double radius)
    {

        if (radius < 0.0 || radius > 100.0) //Verifies Radius
        {
            System.out.println("Please input a valid radius");
            setRadius(radius);
        }
       return radius;
    }

    public static double getRadius(double radius)
    {
        return radius;
    }

    public double Perimeter() //method that calculate the circle’s perimeter
    {
        getRadius(radius);
        double perimeter = 3.14*(radius*2);
        return perimeter;
    }

    public double Area() //method that calculate the circle’s area
{
    getRadius(radius);
    double area = 3.14*(radius*radius);
    System.out.println(area);
    return area;
}
    public static void main(String args[])
    {
        double radius = 1.0; //attribute radius which defaults to 1.0
        System.out.println("Please input radius of circle: ");
        Scanner scan = new Scanner(String.valueOf(radius));
        radius = scan.nextDouble();
        setRadius(radius);
        getRadius(radius);
        

    }

}
