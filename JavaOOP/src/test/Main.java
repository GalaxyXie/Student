package test;

import model.Student;

public class Main {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setStudentName("Laura");
        stu.setStudentAge(22);
        stu.setStudentNum("201558080105");
        stu.setStudentSex("女");
        System.out.println(stu.getStudentName());
        System.out.println(stu.getStudentAge());
        System.out.println( stu.getStudentNum());
        System.out.println( stu.getStudentSex());

    }
}
