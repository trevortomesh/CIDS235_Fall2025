public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println("student1.name is : " + student1.name);
        student1.name = "Ethan";
        System.out.println("student1.name is : " + student1.name);
        System.out.println("student1.wnumber is: " + student1.wnumber);
        student1.wnumber = "w10101010";
        System.out.println("student1.wnumber is: " + student1.wnumber);
        System.out.println("student1.age: " + student1.age);
        student1.age = 21;
        System.out.println("student1.age: " + student1.age);
        
        student1.isCSMajor = true;
        student1.sex = 'M';


        // Circle circle1;
        // Circle circle2 = new Circle(5);
        // circle1 = circle2;

        // circle2.radius = 3.4;
        // System.out.println(circle2);
        // System.out.println(circle1);

    //     System.out.println("Circle1 has a radius of: " + circle1.radius);
    //     System.out.println("Circle2 has a radius of: "+ circle2.radius);
    //    // System.out.println("The area of circle2 is: " + (Math.PI * circle2.radius * circle2.radius));
    //     System.out.println("The area of circle2 is: " + circle2.getArea());
    //     System.out.println("The circumference of circle1 is " + circle1.getPerimeter());
    }
}

