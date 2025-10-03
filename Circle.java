public class Circle {
    private double radius;
    private static int numberOfObjects = 0;
    
    public Circle(){
        this(1.0);
    }

    public Circle(double radius){
        //System.out.println("This is the parameterized constructor");
        this.radius = radius;
        numberOfObjects++;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return 2 * this.radius * Math.PI;
    }

    
    public static int getNumberOfObjects(){
        System.out.println(Circle.numberOfObjects);
        return numberOfObjects;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        if(radius > 0.0){
            this.radius = radius;
        } else{
            this.radius = 1.0;
        }
    }


}
