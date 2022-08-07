public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOs = 1;
        if (clientOs == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println(clientOs);

        //Задание 2
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию для Ios");
        }
        if (clientDeviceYear >= 2015 && clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOs != 0) {
            System.out.println("Установите облегченную версию для Android");
        }
        if (clientDeviceYear >= 2015 && clientOs != 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание 3
        int year = 2021;
        if (year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            if (year % 100 == 0) {
                System.out.println("Год невисокосный");
            } else {
                if (year % 4 == 0) {
                    System.out.println("Год високосный");
                } else {
                    System.out.println("Год невисокосный");
                }
            }
        }
        //Задание 4
        int deliveryDistance = 10;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
        }
        //Задание 5
        int monthNumber =5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого не существует");
        }



        }
    }





