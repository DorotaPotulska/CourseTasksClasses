package JavaGda34.weekend4.interfejsy.zad5_Student;
/*
        1. Utwórz klasę Student
        2. Nadaj następujące atrybuty: Imie, Nazwisko, numer albumu
        3. Zaimplementuj interfejs Comparable, tak aby sortować studentów od najmniejszego numeru indeksu
        do największego
        4. W metodzie psvm utwórz kilka obiektów typu Student i dodaj do tablicy
        5. Wyświetl Studentów przed i po sortowaniu
        6. * Zrób odwrotne sortowanie
*/

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Student student1= new Student("Dorota","Potulska",99204);
        Student student2= new Student("Piotr","Potulski",99445);
        Student student3= new Student("Maks","Potulski",321);
        Student student4= new Student("Anastazja","Potulska",231);

        Student [] tabStudentow= {student1,student2,student3,student4};

        for(Student student:tabStudentow){
            System.out.println(student.toString());
        }
        System.out.println();

        Arrays.sort(tabStudentow);

        for(Student student:tabStudentow){
            System.out.println(student.toString());
        }
    }
}
