public class Main {
    public static void main(String[] args) {
        // Task 1
        byte clientOS = 0; // 0 — iOS, 1 — Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Некорректное значение clientOS: " + clientOS);
        }

        // Task 2
        byte clientOS2 = 0; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2013;

        if (clientOS2 == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS2 == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Некорректное значение clientOS2: " + clientOS2);
        }

        // Task 3
        int year = 1000;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }

        // Task 4
        int deliveryDistance = 30;
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            deliveryDays = 0;
        }

        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка в ваш регион недоступна");
        }

        // Task 5
        int monthNumber = 1;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон: Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон: Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон: Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон: Осень");
                break;
            default:
                System.out.println("Некорректный месяц: " + monthNumber);
        }
    }
}
