import java.util.Scanner;

public class RectangleArea {
    private int length;
    private int breadth;

    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RectangleArea rect = new RectangleArea();

        System.out.print("Enter length: ");
        int length = scanner.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = scanner.nextInt();

        rect.setDim(length, breadth);

        System.out.println("Area of the rectangle: " + rect.getArea());
    }
}
