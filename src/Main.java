import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // prog — число созданное программой
        // user — число введённое пользователем
        int prog, user;
        int p = 0;
        // Генерируем случайное целое число от 1 до 9999
        Random random = new Random();
        prog =  random.nextInt(9999);
        System.out.println("Я загадала число от 1 до 9999, отгадайте его.");
        System.out.print("Вводите ваше число: ");
        Scanner input = new Scanner(System.in);
        // Проверяем, есть ли в потоке ввода целое число
        if( input.hasNextInt() ) {
            do {
                // Читаем с потока ввода целое число
                user = input.nextInt();
                if(user == prog) {
                    System.out.println("Вы угадали!");
                } else {
                    // Проверяем, входит ли число в отрезок [1;9999]
                    if (user > 0 && user <= 9999) {
                        System.out.print("Вы не угадали! ");
                        // Если число загаданное программой меньше...
                        if( prog < user ) {
                            System.out.println("Моё число меньше.");
                        } else {
                            System.out.println("Моё число больше.");
                        }
                        if (input.hasNextInt()){
                            p++;
                            System.out.println("Использовано попыток: " + p);
                        }
                    } else {
                        System.out.println("Ваше число вообще не из нужного отрезка!");
                    }
                }

            } while( user != prog );
        } else {
            System.out.println("Ошибка. Вы не ввели целое число!");
        }
        System.out.println("До свиданья!");
    }
}