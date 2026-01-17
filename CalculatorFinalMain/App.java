package CalculatorFinalMain;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 양의 정수를 입력해주세요");
        int first = sc.nextInt();

        System.out.println("두번째 양의 정수를 입력해주세요");
        int second = sc.nextInt();

        System.out.println("연산자를 입력해주세요 (+,-,*,/)");
        char cal = sc.next().charAt(0);

        switch(cal) {
            case '+' :
                int result1 = first + second;
                System.out.println(result1);
                break;

            case '-' :
                int result2 = first - second;
                System.out.println(result2);
                break;

            case '*' :
                int result3 = first * second;
                System.out.println(result3);
                break;

            case '/' :
                if (second == 0) {
                    System.out.println("0으로 나눌 수 없습니다");
                }
                int result4 = first / second;
                System.out.println(result4);
                break;

            default:
                System.out.println("this is error");
        }

        System.out.println("연산을 종료합니다.");
    }



}