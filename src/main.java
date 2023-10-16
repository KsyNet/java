/* Упражнение 1
Напишите консольную программу, в которой пользователь с клавиатуры вводит два числа.
А программа сранивает два введенных числа и выводит на консоль результат сравнения (два числа равны,
первое число больше второго или первое число меньше второго).

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = sc.nextInt();
        System.out.print("Введите второе число: ");
        int y = sc.nextInt();
        if (x > y) {
            System.out.println("Первое число больше второго");
        } else if (x < y) {
            System.out.println("Первое число меньше второго");
        }
        else {
            System.out.println("Оба числа равны");
        }
     }
}
*/

/* Упражнение 2
Напишите консольную программу, в которой пользователь вводит с клавиатуры число.
Если число одновременно меньше 9 и больше 2, то программа выводит "Число больше 5 и меньше 10".
Иначе программа выводит сообщение "Неизвестное число".

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = sc.nextInt();
        if (x > 2 && x < 9) {
            System.out.println("Число больше 5 и меньше 10");
        } else {
            System.out.println("Неизвестное число");
        }

    }
}
*/

/* Упражнение 3
В банке в зависимости от суммы вклада начисляемый процент по вкладу может отличаться.
Напишите консольную программу, в которую пользователь вводит сумму вклада.
Если сумма вклада меньше 100, то начисляется 5%. Если сумма вклада от 100 до 200, то начисляется 7%.
Если сумма вклада больше 200, то начисляется 10%.
В конце программа должна выводить сумму вклада с начисленными процентами.

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        double x = sc.nextDouble();
        if (x < 100) {
            x += x * 0.05;
            System.out.println("Сумма вклада с процентами " + x);
        }
        else if (x >= 100 && x <= 200){
            x += x * 0.07;
            System.out.println("Сумма вклада с процентами " + x);
        }
        else {
            x += x * 0.1;
            System.out.println("Сумма вклада с процентами " + x);
        }
    }
}
 */

/*Упражнение 4
Напишите консольную программу, которая выводит пользователю сообщение "Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение".
Рядом с названием каждой операции указан ее номер, например, операция вычитания имеет номер 2. Пусть пользователь вводит в программе номер операции,
и в зависимости от этого номера программа выводит название операции.
Для определения операции по введенному номеру используйте конструкцию switch...case.
Если введенное пользователем число не соответствует никакой операции (например, число 120), то выведите пользователю сообщение о том, что операция неопределена.

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер операции: \n 1 Сложение \n 2 Вычитание \n 3 Умножение");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("Сложение");
                break;
            case 2:
                System.out.println("Вычитание");
                break;
            case 3:
                System.out.println("Умножение");
                break;
            default:
                System.out.println("Операция не определена");
        }
    }
}

 */

/*Упражнение 5
Измените предыдущую программу. Пусть пользователь кроме номера операции вводит два числа, и в зависимости от
номера операции с введенными числами выполняются определенные действия (например, при вводе числа 3 числа умножаются).
Результат операции выводиться на консоль.


 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число " );
        int x1 = sc.nextInt();
        System.out.print("Введите второе число ");
        int x2 = sc.nextInt();
        System.out.println("Введите номер операции: \n 1 Сложение \n 2 Вычитание \n 3 Умножение");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("Результат операции " + (x1+x2));
                break;
            case 2:
                System.out.println("Результат операции " + (x1-x2));
                break;
            case 3:
                System.out.println("Результат операции " + (x1*x2));
                break;
            default:
                System.out.println("Операция не определена");
        }
    }
}
