package Arrays_1;

import java.util.Arrays;
import java.lang.Comparable;

class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        // e1.compareTo(e2)
        // age -> e1->age, employee.age -> employee->age
        if (age == employee.age) {
            return (salary - employee.salary);
        }

        return (age - employee.age);
    }

    public String toString() {
        return String.format("(%s, %d, %d)", name, age, salary);
    }
}

public class CustomSort {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("udit", 19, 40000);
        employees[1] = new Employee("Mohit", 19, 40000);
        employees[2] = new Employee("manu", 19, 40000);
        employees[3] = new Employee("aadhya", 19, 40000);
        /*
         * sort function expects that The Class will implement comparable interface and
         * give implementation body to the compareTo method because only this method
         * will be called after calling the sort() method and then JVM will see the
         * natural ordering defined by compareTo() method
         */
        Arrays.sort(employees);
        System.out.println("After sorting: " + Arrays.toString(employees));
    }
}

/*
 * char ASCII Value :-
 * char ch = 'a';
 * int as_cii = ch;
 * System.out.println("ASCII value of " + ch + " is - " + as_cii);
 * 
 * 
 * String ASCII value :-
 * String alphabets = "abcdjfre";
 * for(int i=0;i<alphabets.length();i++){
 * char ch = alphabets.charAt(i);
 * System.out.println("ASCII value of " + ch + " is - " + (int)ch);
 * }
 */