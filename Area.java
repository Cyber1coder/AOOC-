import java.util.Scanner;
class Area
{
    double lenght;
    double breadth;
    void setDim(double l, double b)
    {
        lenght = l;
        breadth = b;
    }
    double getArea()
    {
        return lenght*breadth;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Area rec = new Area();
        System.out.print("Enter the length of the rectangle: ");
        
        double lenght=sc.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
       
         double breadth=sc.nextDouble();

        rec.setDim(lenght, breadth);
         double area = rec.getArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}