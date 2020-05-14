package JavaGda34.weekend5.zad2_student;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Jan", 1);
        Student student2 = new Student("Jan", 1);

        Map<Student,Integer> obecnosci= new HashMap<>();

        obecnosci.put(student1,0);
        obecnosci.put(student2,10);

        System.out.println(obecnosci);


    }
}
