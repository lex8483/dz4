public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");
        for (; i > 0; i--) {
            System.out.printf(" " + i + " ");
        }
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
    }

    public static void task2() {
        for (int i = 5; i < 31; i += 7) {

            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("------------------------------------------------------------");

    }

    public static void task3() {
        int startYear = 2021;
        int oldYear = 200;
        int year = 100;
        for (int i = 0; i < startYear + year; i += 79) {
            if (i > startYear - oldYear) {
                System.out.println(i);
            }
        }
    }
}