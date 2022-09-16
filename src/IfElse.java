import java.util.Scanner;

public class IfElse {
    private static Scanner scan;

    public static void main(String[] args) {
//        if :  가장 많이 사용되는 조건문, 조건식 결과가 참일 경우 해당 코드블럭을 실행하는 형태 조건문
//        if : 단순 if
        scan = new Scanner(System.in);
        System.out.println("숫자입력");
        int n = scan.nextInt();
//        ~
        if (n % 2 == 8) {
            System.out.println("입력 숫자 짝수");
        } // ~ 코드블럭
        System.out.println("입력 숫자 " + n + "입니다.");

//      --- if~else : 조건식 결과가 참일 경우 코드블럭 실행, 거짓일 경우 else 아래 코드블럭 실행---
//                      반드시 둘 중 하나는 선택해야한다.
        System.out.println("탕수육먹는형태");
        System.out.print("찍? 부? : ");
        String input = scan.next();
//        equals(문자열) : 지정한 문자열과 동일한 문자열인지 확인. t/f로 출력한다.
        if (input.equals("부")) {
            System.out.println("탕수육의 원래 형태는 부먹? ");
        } else {
            System.out.println("찍먹?");
        }


//        else if :  조건식 여러개가 존재해 조건식 결과가 참인 코드블럭을 실행하는 형태
//        숫자로 작성할 시 논리적으로 오류가 나지 않게 조심할 것 -> 해당하는 조건이 단계별로 갈 수 있도록 작성할 것.
//          = 조건식을 여러개 사용하기에 단계별 설계가 필요함. (문법적으로는 오류가 없어 실행은 된다. 엉뚱한 답이 나온다는 것이 문제)
//         * else if 마지막 else 문은 생략이 가능하다

//        System.out.println("점수입력");
//
//            int grade = scan.nextInt();
//
//                if (grade >= 98) {
//                    System.out.println("your greade is " + grade + " and A");
//                }
//                else if (grade >= 88){
//                    System.out.println( "your greade is " + grade + " and b ");
//                }
//                    else if (grade >= 78){
//                    System.out.println( "your greade is " + grade + " and c ");
//                    }
//                      else if (grade >= 68) {
//                    System.out.println( "your greade is " + grade + " and d ");
//                      }
//                      else {
//                    System.out.println( "your greade is " + grade + " and f ");
//                      }
//
//        System.out.println("점수입력");
//
//        int grade = scan.nextInt();
//
//        if (grade >= 98) {
//            System.out.println("your greade is " + grade + " and A");
//        }
//        else if (grade >= 88){
//            System.out.println( "your greade is " + grade + " and b ");
//        }
//        else if (grade >= 78){
//            System.out.println( "your greade is " + grade + " and c ");
//        }
//        else if (grade >= 68) {
//            System.out.println( "your greade is " + grade + " and d ");
//        }
//        else if (grade <= 68){
//            System.out.println( "your greade is " + grade + " and f ");
//          이런 식으로 작성할 경우 else문은 생략이 가능. else 구문 아예 쓰지 않을 경우에 이런 식으로 작성한다.
//          위와 같이 어떤 점수 이하는 보여주지 않을 때나 보여는 주나 등급이 없다고 나타낼 경우

//        중첩 if : if,if~else,else if 문 코드 내 if문을 또 사용하는 방식


        System.out.println("중첩 if문");
        System.out.println("점수를 입력");
        int grade = scan.nextInt();

        if (grade >= 98) {
            System.out.println("your greade is " + grade + " and A");}
        else {
            if (grade >= 88) {
                System.out.println("your greade is " + grade + " and b ");
            } else {
                if (grade >= 78) {
                    System.out.println("your greade is " + grade + " and c ");
                } else {
                    if (grade >= 68) {
                        System.out.println("your greade is " + grade + " and d ");
                    } else {
                        System.out.println("your greade is " + grade + " and f ");
                    }

                }
            }


        }





    }
}

