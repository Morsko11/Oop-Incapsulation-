package org.example;

import stud.Aspirant;
import stud.Saintist;
import stud.Student;
import tqwt.Csaa;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Main extends Csaa {
    public Main(int a, String b, int c) {
        super(a, b, c);
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student[] students = new Student[7];
        students[0] = new Aspirant("Mark", "Ivanov", "16", 5.0);
        students[1] = new Student("Oleg", "Vis", "52", 4.1);
        students[2] = new Student("Viktor", "Viktor", "51", 5.0);
        students[3] = new Student("rwr", "Vidasdktor", "521", 5.0);
        students[4] = new Aspirant("Mark", "r34", "16", 4.6);
        students[5] = new Saintist( "Vasf", "1234", "77", 3.1, "kASdasd");
        students[6] = new Saintist("ERtg", "421", "88", 5.0,"Kandidask");
double min = students[0].getAverageMark();
Student student = null;
        for (int i = 0; i < students.length; i++) {
         if (students[i].getClass() == Aspirant.class ){
             System.out.println(students[i].toString());

         }

        }



/*    Incaps incaps = new Incaps();
        Field a = Incaps.class.getDeclaredField("a");
        a.setAccessible(true);
        int s = (int)a.get(incaps);
System.out.println(s);*/

        /*Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5,
то сумма 2000 грн, иначе 1900. Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 2500 грн, иначе 2200.
Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.*/

    }

}