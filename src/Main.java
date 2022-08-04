public class Main {
    public static void main(String[] args) {
        //Задание 0
        int clientOs = 0;
        boolean userIos = clientOs == 0;
        if (userIos) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println(clientOs);

        //Задание 2
        int clientDeviceYear = 2014;
        boolean userAnd = clientOs == 1;
        boolean lightVersion = clientDeviceYear < 2015;
        boolean normalVersion = clientDeviceYear >= 2015;
        if (lightVersion && userIos) {
            System.out.println("Установите облегченную версию для Ios");
        } else {
            if (normalVersion && userIos) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                if (lightVersion && userAnd) {
                    System.out.println("Установите облегченную версию для Android");
                } else {
                    if (normalVersion && userAnd) {
                        System.out.println("Установите версию приложения для Android по ссылке");
                    }
                }

            }
            System.out.println(lightVersion && userAnd);
        }

    }
}



