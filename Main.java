public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(3.2);

        System.out.println(c1.getRadius());
        System.out.println(Circle.getNumberOfObjects());

        // int i = 5;
        // myMethod(i);
        // System.out.println("i is " + i + " in the main.");

        // Circle[] circleArray = new Circle[10];
        // for(int i = 0; i < circleArray.length; i++){
        //     circleArray[i] = new Circle();
        // }

        // System.out.println(circleArray);
        // System.out.println(circleArray[0]);
        // System.out.println(circleArray[0].getRadius());

        // printCircleArray(circleArray);
     
}

    public static void myMethod(int i){
        i = 99;
        System.out.println("i is " + i + " in the method!");
    }

    public static void printCircleArray(Circle[] circleArray){
        for(int i = 0; i < circleArray.length; i++){
            System.out.println("circleArray["+i+"]" + " is " + circleArray[i]);
            System.out.println("radius: " + circleArray[i].getRadius());
        }
    }
    public static void printAreas(Circle c, int times){
        System.out.println("Radius \t\tArea");
        while(times >= 1){
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
    public static void printCircle(Circle c){
        System.out.println("The area of the circle of radius " 
        + c.getRadius() + " is " + c.getArea());
        c.setRadius(12.0);
    }

}

