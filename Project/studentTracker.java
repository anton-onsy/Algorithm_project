package Project;
import java.util.AbstractList;
import java.util.ArrayList;

public class studentTracker {

    //private final ArrayList<Integer> grades;
    String name;
    studentGrades Stdgrades;

    public studentTracker(String name, ArrayList<Integer> grades) {
        Stdgrades=new studentGrades(grades);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return Stdgrades.getGrades();
    }

    ///////////////////studentName sorting Algorithm\\\\\\\\\\\\\\\\\\\\\\\
    //////////////////// selection sort\\\\\\\\\\\\\\\\\\\\
    public static void selectionSortStd(ArrayList<studentTracker> students) {
        for (int i = 0; i < students.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(j).getName().compareToIgnoreCase(students.get(minIndex).getName()) < 0) {
                    minIndex = j;
                }
            }
            // Swap
            studentTracker temp = students.get(i);
            students.set(i, students.get(minIndex));
            students.set(minIndex, temp);
        }
    }

    //////////////////// Bubble sort\\\\\\\\\\\\\\\\\\\\\
    public static void bubbleSortStd(ArrayList<studentTracker> students) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).getName().compareToIgnoreCase(students.get(j + 1).getName()) > 0) {
                    // Swap
                    studentTracker temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }
    ////////////////////////////WE CAN ADD MANY SORTING ALGORITHM AS WE LIKE \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
}






