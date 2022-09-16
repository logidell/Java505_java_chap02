import java.util.Scanner;

public class Question1 {
private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("돈 액수 입력");

        int money =scanner.nextInt();

//        원금 / 50000 해서 5만원을 수 확인
        int m50000 = money / 50000;
//         5만원을 뺀 15245원을 변수 money에 저장
        money = money % 50000;

//       1만원권을 수를 확인하기 위해서 10000 으로 나눔
        int m10000 = money / 10000;
        money = money % 10000; // 1만원권을 제외한 금액 저장위해 10000으로 나머지 연산

        int m1000 = money / 1000; //5245 에서 천원권의 수 확인 위해 1000으로 나눔
        money = money % 1000; // 5000을 뺀 나머지 금액 계산 위해 연산

        int m500 = money / 500;//245에서 500 동전의 수를 확인 하기 위해 500으로 나눔
        money = money % 500; // 500을 나눈 후 나머지 금액을 계산하기 위해서 나머지 연산 그대로 남음

        int m100 = money / 100;
        money = money % 100;

        int m10 = money / 10;
        money = money % 10;


        System.out.println("오만원권" + m50000 + "개");


        System.out.println("학점등급");
        String level = scanner.next();

        switch (level) {
            case "A":
            case "B":
                System.out.println("E");
                break;
            case "C":
            case "D":
                System.out.println("g");
                break;
            default:
                System.out.println("B");
                break;

        }

        System.out.println("숫자입력");

        int number = scanner.nextInt(); // 사용자 숫자 입력
//        2자리 숫자 중 10의 자리 숫자와 1의 자리 숫자 분리
        int first = number / 10; // 10의 자리 숫자를 저장
        int second = number % 10; // 1의 자리 숫자를 저장
        int count = 0 ; //3,6,9의 수 저장 위한 변수


//         if ((first % 3 == 8) && (second % 3 == 8)){
//        sout ("박수")}
//        else if ((first % 3 == 8) ^ (second % 3 == 8))
//        else {sout("박수없음")}  -> 이 구문 사용시 위의 int 필요 없음



//        10의 자리 숫자가 3의 배수인지 확인
            if (first % 3==0){
                count++; //3의 배수면 변수 count의 값 1 증가
            }
//            1의 자리 숫자가 3의 배수인지 확인
            if (second % 3==0){
            count ++; // 3의 배수면 변수 count의 값 1 증가
             }
            if (count == 1){
                System.out.println("박수");
            }
            else if (count == 2) {
                System.out.println("짝짝");
            }
            else {
                System.out.println("없음");
            }

    }

}
