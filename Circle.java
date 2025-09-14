public class Circle {
    double radius;

    Circle(){
        //System.out.println("This is the default constructor");
        //System.out.println("No argument given -- the radius is: " + radius);
        radius = 1.0;
    }

    Circle(double newRadius){
        //System.out.println("This is the parameterized constructor");
        radius = newRadius;
    }

    double getArea(){
        return Math.PI * radius * radius;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
}
