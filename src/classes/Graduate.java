package classes;

import java.util.Scanner;

public class Graduate extends Student{
    String DplTheme;

    Graduate(){
        super("Муслимов", "Петр", 2, 4);
        this.DplTheme = "Разработка приложений под iOS";
    }

    Graduate(String SecName, String FirName, int Course, int ID, String DplTheme){
        super(SecName, FirName, Course, ID);
        this.DplTheme = DplTheme;
    }

    @Override
    void StudentOut() {
        System.out.println("Фамилия: "+SecName);
        System.out.println("Имя: "+FirName);
        System.out.println("Курс: "+Course);
        System.out.println("ID: "+ID);
        System.out.println("Тема диплома: "+DplTheme);
    }

    void StudDplChange(String DplTheme){
        this.DplTheme = DplTheme;
    }

    @Override
    void StudAllChange(){
        Scanner in = new Scanner(System.in);
        System.out.println("\n============================");
        System.out.println("ФАМИЛИЯ:");
        String str=in.nextLine();
        this.SecName = str;

        System.out.println("ИМЯ:");
        str=in.nextLine();
        this.FirName = str;

        System.out.println("Тема диплома: ");
        str=in.nextLine();
        this.DplTheme = str;

        System.out.println("КУРС:");
        int k=in.nextInt();
        this.Course = k;

        System.out.println("ID:");
        k=in.nextInt();
        this.ID = k;
    }

}
