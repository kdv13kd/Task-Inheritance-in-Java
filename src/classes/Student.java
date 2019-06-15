package classes;

import java.util.Scanner;

public class Student {
    String SecName;
    String FirName;
    int Course;
    int ID;

    Student(){
        this.SecName = "Сергеев";
        this.FirName = "Иван";
        this.Course = 1;
        this.ID = 0;
    }

    Student(String SecName, String FirName, int Course, int ID){
        this.SecName = SecName;
        this.FirName = FirName;
        this.Course = Course;
        this.ID = ID;
    }

    void StudentOut() {
        System.out.println("Фамилия: "+SecName);
        System.out.println("Имя: "+FirName);
        System.out.println("Курс: "+Course);
        System.out.println("ID: "+ID);
    }

    void StudAllChange(){
        Scanner in = new Scanner(System.in);
        System.out.println("\n============================");
        System.out.println("ФАМИЛИЯ:");
        String str=in.nextLine();
        this.SecName = str;

        System.out.println("ИМЯ:");
        str=in.nextLine();
        this.FirName = str;

        System.out.println("КУРС:");
        int k=in.nextInt();
        this.Course = k;

        System.out.println("ID:");
        k=in.nextInt();
        this.ID = k;
    }

    void StudSnChange(String SecName) {
        this.SecName=SecName;
    }

    void StudFnChange(String FirName) {
        this.FirName=FirName;
    }

    void StudCrsChange(int Course) {
        this.Course=Course;
    }

    void StudIdChange(int id) {
        this.ID=id;
    }

}
