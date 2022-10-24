public class Main {
    public static void verifyHighYear(int year) {
        boolean divide4 = ((year % 4) == 0);
        boolean divide100 = ((year % 100) == 0);
        boolean divide400 = ((year % 400) == 0);

        if ((divide4) && !(divide100)) {
            System.out.println(year + " год является високосным");
        } else if (divide400) {
            System.out.println(year + " год является високосным");
        } else if (divide100) {
            System.out.println(year + " год не является високосным");
        } else if (!(divide4)) {
            System.out.println(year + " год не является високосным");
        }
    }


    public static void verifyVersion(byte clientOS, int clientDeviceYear) {
        boolean verify = (clientOS == 0);

        boolean modern = (clientDeviceYear >= 2015);
        if (verify && modern) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (verify && !modern) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (!(verify) && modern) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void checkDistance(int deliveryDistance) {
        boolean shortTime = (deliveryDistance <= 20);
        boolean middleTime = (deliveryDistance > 20 && deliveryDistance <= 60);
        boolean longTime = (deliveryDistance > 60 && deliveryDistance <= 100);

        int term = (deliveryDistance / 40) + 1;
        if (shortTime) {
            System.out.println("Потребуется дней: " + term);
        } else if (middleTime) {
            System.out.println("Потребуется дней: " + term);
        } else if (longTime) {
            System.out.println("Потребуется дней: " + term);
        } else {
            System.out.println("Нестандартное расстояниеб потребуется дней: " + term);
        }
    }


        //Задача 1
        public static void main(String[] args) {
        int year1 = 2016;
        verifyHighYear(year1);

        //Задача 2
        byte OS = 0;
        int currentYear = java.time.LocalDate.now().getYear();
        verifyVersion(OS, currentYear);

        //Задача 3
        int kilometers = 7;
        checkDistance(kilometers);

    }
}
