package classes;

import classes.Student;
import java.util.Scanner;

public class MMain {
    public static void main(String[] args) {
        boolean F = true;
        Student [] s = new Student[7];
        Graduate [] g = new Graduate[7];

        s[0] = new Student();
        s[1] = new Student("Петров", "Евгений" , 3, 1);
        s[2] = new Student("Симонов", "Дмитрий", 5, 2);
        g[3] = new Graduate();
        g[4] = new Graduate("Лимонов", "Илья", 3, 4, "Нейронные сети");

        System.out.println("СПИСОК СТУДЕНТОВ");
        for (int i=0; i<3; i++)
            System.out.println(i+". "+s[i].SecName+" "+s[i].FirName);
        for (int i=3; i<5; i++)
            System.out.println(i+". "+g[i].SecName+" "+g[i].FirName);

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер студента");
        int k=in.nextInt();
        System.out.println("ИНФОРМАЦИЯ О СТУДЕНТЕ");
        do{
            System.out.println("\n============================");
            System.out.println("1. Показать информацию о студенте");
            System.out.println("2. Изменить  информацию о студенте");
            System.out.println("3. Выход");
            int inp1=in.nextInt();
            switch (inp1){
                case 1:
                    System.out.println("\n============================");
                    if (k>2)
                        g[k].StudentOut();
                    else
                        s[k].StudentOut();
                    break;
                case 2:
                    System.out.println("\n============================");
                    System.out.println("1. Изменить фамилию");
                    System.out.println("2. Изменить имя");
                    System.out.println("3. Изменить курс");
                    System.out.println("4. Изменить ID");
                    System.out.println("5. Изменить все");
                    if (k > 2) System.out.println("6. Изменить тему диплома");
                    Scanner in1 = new Scanner(System.in);
                    int inp2=in.nextInt();
                    switch (inp2){
                        case 1:
                            String SName=in1.nextLine();
                            if (k>2)	g[k].StudSnChange(SName);
                            else		s[k].StudSnChange(SName);
                            break;
                        case 2:
                            String FName=in1.nextLine();
                            if (k>2)	g[k].StudFnChange(FName);
                            else		s[k].StudFnChange(FName);
                            break;
                        case 3:
                            int Crse=in.nextInt();
                            if (k>2)	g[k].StudCrsChange(Crse);
                            else 		s[k].StudCrsChange(Crse);
                            break;
                        case 4:
                            int id=in.nextInt();
                            if (k>2)	g[k].StudIdChange(id);
                            else		s[k].StudIdChange(id);
                            break;
                        case 5:
                            if (k>2)	g[k].StudAllChange();
                            else		s[k].StudAllChange();
                            break;
                        case 6:
                            if (k>2){
                                String Dpl=in1.nextLine();
                                g[k].StudDplChange(Dpl);
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    F = false;
                    break;
            }
        }while (F);
    }

}
