import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int i = 0;
        while (i < 10) {
            ++i;
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.printf(" " + i + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");
    }

    public static void task2() {
        for (int i = 5; i <= 31; i += 7) {

            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("------------------------------------------------------------");

    }

    public static void task3() {
        int startYear = LocalDate.now().getYear();
        int oldYear = 200;
        int year = 100;
        for (int i = 0; i < startYear + year; i += 79) {
            if (i > startYear - oldYear) {
                System.out.println(i);
            }
        }
        System.out.println("------------------------------------------------------------");
    }

    public static void task4() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + " - ping");
            } else if (i % 5 == 0) {
                System.out.println(i + " - pong");
            } else {
                System.out.println(i);
            }
        }
        System.out.print("\n" + "------------------------------------------------------------" + "\n");

    }

    public static void task5() {
        int a = 0;
        int b = 1;
        int sum = a + b;
        int c = sum+sum;;
        for (int i = 0; i < 10; i++) {


                    c = c*2;
                System.out.print(c + " ");


        }


    }

}