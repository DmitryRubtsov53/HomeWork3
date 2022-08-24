public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1. Тип приложения по ОС.");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println(" ");

        System.out.println("Задача 2. Тип приложения по году выпуска и типу ОС.");

        int clientDeviceYear = 2010;
        // Переменная типа ОС телефона клиента определена в Задаче 1.
        System.out.println("Год выпускателефона клиента - " + clientDeviceYear);
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную  версию приложения для Android по ссылке.");
        }
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите приложение для iOS по ссылке.");
        }
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите приложение для Android по ссылке.");
        }
        System.out.println(" ");

        System.out.println("Задача 3. Високосный год.");
        // Нужно определить является текущий год високосным или нет.
        int year = 2022;
        if (year % 4 == 0) {
            if ((year % 100 == 0) && (year % 400 == 0)) {
                System.out.println(year + " год является високосным.");
            }
            System.out.println(year + " год не является високосным.");
        }
        System.out.println(" ");

        System.out.println("Задача 4. Доставка банковских карт");
        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("На доставку карты потребуется 1 день.");
        }
        if (20 < deliveryDistance && deliveryDistance <= 60) {
            System.out.println("На доставку карты потребуется 2 день.");
        }
        if (60 < deliveryDistance && deliveryDistance <= 100) {
            System.out.println("На доставку карты потребуется 3 день.");
        } else
            System.out.println("Доставку карт на такое расстояние не делаем.");
        System.out.println(" ");

        System.out.println("Задача 5. Времена года");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Зима"); break;
            case 2:
                System.out.println("Зима"); break;
            case 3:
                System.out.println("Весна"); break;
            case 4:
                System.out.println("Весна"); break;
            case 5:
                System.out.println("Весна"); break;
            case 6:
                System.out.println("Лето"); break;
            case 7:
                System.out.println("Лето"); break;
            case 8:
                System.out.println("Лето"); break;
            case 9:
                System.out.println("Осень"); break;
            case 10:
                System.out.println("Осень"); break;
            case 11:
                System.out.println("Осень"); break;
            case 12:
                System.out.println("Зима"); break;
        }
    }
}