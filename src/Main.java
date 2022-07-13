public class Main {
    public static void main(String[] args) {
        // Task 1
        byte clientOS = 1; // 0 — iOS, 1 — Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Task 2
        byte clientOS2 = 1; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2020;

        if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // Task 3

        // Task 4
        int deliveryDistance = 150;
        int deliveryDays = 0;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 99; // No delivery
        }

        if (deliveryDays <= 3) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка не доступна");
        }

        // Task 5
        int monthNumber = 13;

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
                System.out.println("Такого сезона не существует");
        }
    }
}