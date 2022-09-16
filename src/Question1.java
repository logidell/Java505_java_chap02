import java.util.Scanner;

public class Question1 {
private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("돈 액수 입력");

        int money =scanner.nextInt();

//
        int m50000 = money / 50000; //  '원금 / 50,000' 한 뒤 5만원권 수량 확인
        money = money % 50000; // 5만원권을 뺀 15,245원을 변수 money에 저장

        int m10000 = money / 10000; //1만원권을 수를 확인하기 위해서 10,000 으로 나눔
        money = money % 10000; // 1만원권을 제외한 금액 저장을 위해 10,000으로 나머지 연산

        int m1000 = money / 1000; // 5,245 에서 천원권의 수 확인 위해 1,000으로 나눔
        money = money % 1000; // 5,000을 뺀 나머지 금액 계산 위해 연산

        int m500 = money / 500; //245에서 500 동전의 수를 확인 하기 위해 500으로 나눔
        money = money % 500; // 500을 나눈 후 나머지 금액을 계산하기 위해서 나머지 연산, 245그대로 남음

        int m100 = money / 100; // 245에서 100원의 동전 수 확인 위해 100으로 나눈다.
        money = money % 100; // 200을 뺀 나머지 값을 계산

        int m10 = money / 10;
        money = money % 10;


        System.out.println("오만원권 " + m50000 + "개");
        System.out.println("일만원권 " + m10000 + "개");
        System.out.println("일천원권 " + m1000 + "개");
        System.out.println("오백원 동전 " + m500 +"개");
        System.out.println("일백원 동전 " + m100 + "개");
        System.out.println("일십원 동전 " + m10 + "개");
        System.out.println("일원 동전 " +m10 + "개");

        System.out.println("학점등급");
        String level = scanner.next();

        switch (level) {
            case "A":
            case "B":
                System.out.println("Excellent");
                break;
            case "C":
            case "D":
                System.out.println("Good");
                break;
            case "F" :
                System.out.println("Bye");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;

        }

        System.out.println("숫자입력");

        int number = scanner.nextInt(); // 사용자 숫자 입력
//        2자리 숫자 중 10의 자리 숫자와 1의 자리 숫자 분리
        int first = number / 10; // 10의 자리 숫자를 저장
        int second = number % 10; // 1의 자리 숫자를 저장
        int count = 0 ; //3,6,9의 수 저장 위한 변수


         if ((first % 3 == 8) && (second % 3 == 8)){
             System.out.println("박수");
         }
        else if ((first % 3 == 8) ^ (second % 3 == 8)){

         }
        else {
             System.out.println("박수없음");
        } // -> 이 구문 사용시 위의 int 필요 없음



////        10의 자리 숫자가 3의 배수인지 확인
//            if (first % 3==0){
//                count++; //3의 배수면 변수 count의 값 1 증가
//            }
////            1의 자리 숫자가 3의 배수인지 확인
//            if (second % 3==0){
//            count ++; // 3의 배수면 변수 count의 값 1 증가
//             }
//            if (count == 1){
//                System.out.println("박수");
//            }
//            else if (count == 2) {
//                System.out.println("짝짝");
//            }
//            else {
//                System.out.println("없음");
//            }

    }

}
