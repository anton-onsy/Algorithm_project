package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithm_project {

    public static void main(String[] args) {
        ArrayList<studentTracker> students = new ArrayList<>();
        ArrayList<studentGrades> Stdgrades = new ArrayList<>();

        Stdgrades.add(new studentGrades( new ArrayList<>(List.of(90, 85, 88))));
        Stdgrades.add(new studentGrades( new ArrayList<>(List.of(75, 80, 82))));
        Stdgrades.add(new studentGrades( new ArrayList<>(List.of(95, 91, 87))));

        students.add(new studentTracker("Bob", Stdgrades.get(0).getGrades()));
        students.add(new studentTracker("Anton",Stdgrades.get(1).getGrades()));
        students.add(new studentTracker("Charlie", Stdgrades.get(2).getGrades()));

        for (studentTracker student : students) {
            studentGrades.selectionSortG(student.getGrades());
        }
        studentTracker.bubbleSortStd(students);

        for (studentTracker student : students) {
            System.out.println("Student: " + student.getName());
            System.out.println("Grades: " + student.getGrades());
            System.out.println();
        }
    }
}



