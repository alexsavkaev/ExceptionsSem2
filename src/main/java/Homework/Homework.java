package Homework;

import java.util.Scanner;


public class Homework {
    public static void main(String[] args) {
        inputFloat();
        divideByZero();




    }
    /*
1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 и возвращает введенное значение. Ввод текста вместо числа не должно приводить
 к падению приложения, вместо этого, необходимо повторно запросить у пользователя
 ввод данных.
 */
    static Scanner scanner  = new Scanner(System.in);
    public static void inputFloat(){
        while(true){
            System.out.println("Введите дробное число (типа float): ");
            try {
                float input = Float.parseFloat(stringIsEmpty(scanner.nextLine()));
                System.out.printf("Введённое число - %.2f\n", input);
                break;
            }
            catch (NumberFormatException e){
                System.out.println("Введённое число должно быть типа float.");
            } catch (EmptyStringException e) {
                System.out.println("Пустые строки вводить нельзя!");
            }
        }
    }
    /*
        2. Если необходимо, исправьте данный код
         (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
         */
    public static void divideByZero() {
        int[] intArray = new int[9];
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    /*
    Разработайте программу, которая выбросит Exception,
    когда пользователь вводит пустую строку. Пользователю должно показаться сообщение,
     что пустые строки вводить нельзя.
     */
    public static String stringIsEmpty(String s) throws EmptyStringException {
        if(s.isBlank()) {
            throw new EmptyStringException();
        }
        return s;

    }



}

