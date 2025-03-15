/*6)Create a student class 
	create 5 student objects and store it in a proper data structure
	find the average marks of the student  */

import java.util.ArrayList;

class Student {
    String name;
    int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentAverage {
    public static void main(String[] args) {
        // Create an ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();
        
        // Adding 5 student objects
        students.add(new Student("Mark", 85));
        students.add(new Student("Chrish", 71));
        students.add(new Student("Neviy", 90));
        students.add(new Student("Daniel", 88));
        students.add(new Student("Ama", 95));
        
        // Calculate average marks
        int totalMarks = 0;
        for (Student s : students) {
            totalMarks += s.marks;
        }
        
        double averageMarks = (double) totalMarks / students.size();
        System.out.println("Average Marks: " + averageMarks);
    }
}
