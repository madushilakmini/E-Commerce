/* 
6) Create a student class
	-create 5 student objects and store it in 
	a proper datastructure
    - find the average marks of the students.
 */

import java.util.*;

public class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return this.marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    //calculate the average
    public double getAverage() {
        int sum = 0;
        int n = marks.length;
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }
        return (double) sum / n; 
    }

    //to print students' detals
    public String toString() {
        return "Student Name: " + name + "\nAverage Marks: " + getAverage();
    }

    
    public static void main(String[] args) {
       
        Student[] students = new Student[5];
        students[0] = new Student("Madu", new int[]{85, 90, 78, 92, 88});
        students[1] = new Student("Emma", new int[]{88, 92, 79, 84, 91});
        students[2] = new Student("Sandu", new int[]{70, 75, 80, 85, 90});
        students[3] = new Student("Gaya", new int[]{95, 89, 92, 88, 91});
        students[4] = new Student("Kavi", new int[]{80, 85, 78, 88, 90});

        //to print each student's details
        for (Student student : students) {
            System.out.println(student);
            System.out.println();  
        }
    }
}
