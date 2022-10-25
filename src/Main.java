public class Main {
    public static void verifyHighYear(int year) {

        if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }


    public static void verifyVersion(byte clientOS, int clientDeviceYear) {

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS != 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void checkDistance(int deliveryDistance) {

        int term = (deliveryDistance / 40) + 1;
        System.out.println("Потребуется дней: " + term);
    }


        //Задача 1
        public static void main(String[] args) {
        int year1 = 2016;
        verifyHighYear(year1);

        //Задача 2
        byte OS = 1;
        int currentYear = java.time.LocalDate.now().getYear();
        verifyVersion(OS, currentYear);

        //Задача 3
        int kilometers = 100;
        checkDistance(kilometers);

    }
}
