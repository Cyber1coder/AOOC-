public class shape {
    double dim1,dim2;
    shape(double d1, double d2){
        dim1 = d1;
        dim2=d2;
    }

    abstract double area();

    
}
class rectangle extends shape{
    rectangle(double a, double b){
        super(a,b);
    }
    double area(){
        return dim1*dim2;
    }
}
class triangle extends shape{
    triangle(double c, double d){
        super(c,d);
    }
    double area(){
        return 0.5* c * d;
    }
}

class abstract Absshape{
    public static void main(String args[]){
        shape s = new shape(5,10);
        rectangle r = new rectangle(5,10);
        triangle t = new triangle(10, 20);
        shape s1;
        s1=r;
        System.out.println("Rectangle area is:" + s1.area());
        s1=t;
        System.out.println("Triangle area is:" + s1.area());
    }
}
