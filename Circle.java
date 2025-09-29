public class Circle {
    private double radius = 1.0;
    private static int numberOfObjects = 0;
    public Circle(){
        //System.out.println("This is the default constructor");
        //System.out.println("No argument given -- the radius is: " + radius);
        numberOfObjects++;
        
    }

    public Circle(double newRadius){
        //System.out.println("This is the parameterized constructor");
        radius = newRadius;
        numberOfObjects++;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    
    public static int getNumberOfObjects(){
        System.out.println(Circle.numberOfObjects);
        return numberOfObjects;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius){
        if(newRadius > 0.0){
            radius = newRadius;
        } else{
            radius = 1.0;
        }
    }


}
