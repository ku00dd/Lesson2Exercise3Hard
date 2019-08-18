/*3) Проверить, является ли четырехзначное число счастливым билетом.
Дано четырехзначное число. Проверить, является ли оно «счастливым
билетом». Примечание: счастливым билетом называется число, в
котором - при четном количестве цифр в числе сумма цифр его левой
половины равна сумме цифр его правой половины. Например,
рассмотрим число 1322. Его левая половина равна 13, а правая – 22, и
оно является счастливым билетом (т. к. 1 + 3 = 2 + 2)*/
package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number with even number of characters = ");
        int number = sc.nextInt();
        System.out.println((number/1000+number/100%10)==(number/10%10+number%10)? "Number happy":"Number unhappy");
    }
}
