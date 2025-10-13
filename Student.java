public class Student {
    private Course[] courseList;

    private Name name;
    private Address[] addresses;

    Student(String name){
        this.name = new Name();
        this.name.setName(name);
    }

    public String getName(){
        return this.name.getName();
    }

    public void addCourse(Course c){
        // do stuff here
    }

    public void addAddress(Address a){
        // do stuff here
    }

}
