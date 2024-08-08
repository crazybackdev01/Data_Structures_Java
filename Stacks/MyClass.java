package Stacks;

//OOPS
class Student {
    private String name;
    private int id;

    private Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static Student s = new Student("Mohan", 1);
    public static Student r = new Student("Sohan", 2);

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}

public class MyClass {
    public static void main(String[] args) {
        Student newStudent = Student.s;
        System.out.println(newStudent.getName());
        System.out.println(newStudent.getId());
    }
}
