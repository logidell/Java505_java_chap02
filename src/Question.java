import java.util.Scanner;

public class Question {
    private static Scanner scan;

    public static void main(String[] args) {
//Q1. 성적 점수를 입력받아 점수, 등급을 출력하는 프로그램 작성
//        * else if 문 사용해 작성
//        A+ 95 이상 / A 95 이상 / B+ 85 이상 / B 80이상 / C+ 75이상 / C 70이상 / D 60 이상 / 60미만 F
//         중첩문 IF 문 사용해 각각의 +대의 점수를 출력
        scan = new Scanner(System.in);
        System.out.println("입력하세요");
        int grade = scan.nextInt();

        if (grade >= 95){
            System.out.println("your grade is " + grade + ", A+! good job! ");
        }
        else{
            if (grade >= 90){
                System.out.println("your grade is " + grade + ", A! good!! ");
            }
            else{
                if(grade >= 85){
                    System.out.println("your grade is " + grade + ", B+! good! ");
                }
                else{
                    if(grade >= 70){
                        System.out.println("your grade is " + grade + ", B! good!! ");
                    }
                    else {
                        if ( grade >= 75){
                            System.out.println("your grade is " + grade + ", C+! good job! ");
                        }
                        else{
                            if (grade >= 70) {
                            System.out.println("your grade is " + grade + ", C! good job! ");
                        }
                            else{
                                if (grade >= 60){
                                    System.out.println("your grade is " + grade + ", D! good job! ");
                                } else {
                                    System.out.println("your grade is " + grade + ", F.");
                                }

                            }

                            }

                    }
                }

            }
        }



    }
}