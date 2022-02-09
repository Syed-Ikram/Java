package com.assignment;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

class Student{
    public int id;
    public String name;
    public int age;
    public String gender;
    public String engDepartment;
    public int yearOfEnrollment;
    public double perTillDate;
    Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment,double perTillDate){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
    }
    public void printDetails(){
        System.out.print("\nid:"+this.id+"\nname:"+this.name+"\nage:"+this.age+"\ngender:"+this.gender);
        System.out.println("\nengDepartment:"+this.engDepartment+"\nyearOfEnrollment:"+this.yearOfEnrollment+"\nperTilldate:"+this.perTillDate);
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getPerTillDate() {
        return perTillDate;
    }

    public String getEngDepartment() {
        return engDepartment;
    }
}
public class JavaAssignment12 {
    public static void main(String[] args) {
        ArrayList<Student> studentArray = new ArrayList<>();
        studentArray.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentArray.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentArray.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentArray.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentArray.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentArray.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentArray.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentArray.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentArray.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentArray.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentArray.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentArray.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentArray.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentArray.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentArray.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentArray.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentArray.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        //1
        System.out.println("1");
        Set<String> listOfEngDepartment = studentArray.stream().map(e -> e.engDepartment).collect(Collectors.toSet());
        System.out.println(listOfEngDepartment);
        //2
        System.out.println("2");
        List<String> studentOf2018 = studentArray.stream().filter(n ->n.yearOfEnrollment==2018).map(m ->m.name).collect(Collectors.toList());
        System.out.println(studentOf2018);
        //3
        System.out.println("3");
        studentArray.stream().filter(n -> n.engDepartment.equals("Computer Science") && n.gender.equals("Male")).map(m->m).forEach(y -> y.printDetails());
        //4
        System.out.println("4");
        Map<String, Long> result
                = studentArray.stream().collect(Collectors.groupingBy(p -> p.gender,Collectors.counting()));
        System.out.println(result);
        //5
        System.out.println("5");
        Map<String, Double> result2
                = studentArray.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
        System.out.println(result2);
        //6
        System.out.println("6");
        Student s;
        Optional<Student> result3 = studentArray.stream().collect(maxBy(Comparator.comparing(Student::getPerTillDate)));
        result3.get().printDetails();
        //7
        System.out.println("7");
        Map<String, Long> result4
                = studentArray.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting()));
        System.out.println(result4);
        //8
        System.out.println("8");
        Map<String, Double> result5
                = studentArray.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate)));
        System.out.println(result5);
        //9
        System.out.println("9");
        Optional<Student> result6 = studentArray.stream().collect(minBy(Comparator.comparing(Student::getAge)));
        result6.get().printDetails();
        //10
        System.out.println("10");
        Map<String, Long> result7
                = studentArray.stream().filter(p -> p.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        System.out.println(result7);
    }
}
