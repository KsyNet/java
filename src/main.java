/* ���������� 1
�������� ���������� ���������, � ������� ������������ � ���������� ������ ��� �����.
� ��������� ��������� ��� ��������� ����� � ������� �� ������� ��������� ��������� (��� ����� �����,
������ ����� ������ ������� ��� ������ ����� ������ �������).

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������� ������ �����: ");
        int x = sc.nextInt();
        System.out.print("������� ������ �����: ");
        int y = sc.nextInt();
        if (x > y) {
            System.out.println("������ ����� ������ �������");
        } else if (x < y) {
            System.out.println("������ ����� ������ �������");
        }
        else {
            System.out.println("��� ����� �����");
        }
     }
}
*/

/* ���������� 2
�������� ���������� ���������, � ������� ������������ ������ � ���������� �����.
���� ����� ������������ ������ 9 � ������ 2, �� ��������� ������� "����� ������ 5 � ������ 10".
����� ��������� ������� ��������� "����������� �����".

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������� �����: ");
        int x = sc.nextInt();
        if (x > 2 && x < 9) {
            System.out.println("����� ������ 5 � ������ 10");
        } else {
            System.out.println("����������� �����");
        }

    }
}
*/

/* ���������� 3
� ����� � ����������� �� ����� ������ ����������� ������� �� ������ ����� ����������.
�������� ���������� ���������, � ������� ������������ ������ ����� ������.
���� ����� ������ ������ 100, �� ����������� 5%. ���� ����� ������ �� 100 �� 200, �� ����������� 7%.
���� ����� ������ ������ 200, �� ����������� 10%.
� ����� ��������� ������ �������� ����� ������ � ������������ ����������.

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������� ����� ������: ");
        double x = sc.nextDouble();
        if (x < 100) {
            x += x * 0.05;
            System.out.println("����� ������ � ���������� " + x);
        }
        else if (x >= 100 && x <= 200){
            x += x * 0.07;
            System.out.println("����� ������ � ���������� " + x);
        }
        else {
            x += x * 0.1;
            System.out.println("����� ������ � ���������� " + x);
        }
    }
}
 */

/*���������� 4
�������� ���������� ���������, ������� ������� ������������ ��������� "������� ����� ��������: 1.�������� 2.��������� 3.���������".
����� � ��������� ������ �������� ������ �� �����, ��������, �������� ��������� ����� ����� 2. ����� ������������ ������ � ��������� ����� ��������,
� � ����������� �� ����� ������ ��������� ������� �������� ��������.
��� ����������� �������� �� ���������� ������ ����������� ����������� switch...case.
���� ��������� ������������� ����� �� ������������� ������� �������� (��������, ����� 120), �� �������� ������������ ��������� � ���, ��� �������� ������������.

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ����� ��������: \n 1 �������� \n 2 ��������� \n 3 ���������");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("��������");
                break;
            case 2:
                System.out.println("���������");
                break;
            case 3:
                System.out.println("���������");
                break;
            default:
                System.out.println("�������� �� ����������");
        }
    }
}

 */

/*���������� 5
�������� ���������� ���������. ����� ������������ ����� ������ �������� ������ ��� �����, � � ����������� ��
������ �������� � ���������� ������� ����������� ������������ �������� (��������, ��� ����� ����� 3 ����� ����������).
��������� �������� ���������� �� �������.


 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������� ������ ����� " );
        int x1 = sc.nextInt();
        System.out.print("������� ������ ����� ");
        int x2 = sc.nextInt();
        System.out.println("������� ����� ��������: \n 1 �������� \n 2 ��������� \n 3 ���������");
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("��������� �������� " + (x1+x2));
                break;
            case 2:
                System.out.println("��������� �������� " + (x1-x2));
                break;
            case 3:
                System.out.println("��������� �������� " + (x1*x2));
                break;
            default:
                System.out.println("�������� �� ����������");
        }
    }
}
