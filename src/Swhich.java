import java.util.Calendar;
import java.util.Date;

public class Swhich {
    public static void main(String[] args) {
        char grade ='B' ;

        switch (grade){
           case 'A':
               System.out.println("ㅊㅊ");
               System.out.println("good job, good work!");
             break;
           case 'B' :
               System.out.println("good");
                break;
            case 'C' :
                System.out.println("노력");
                break;
            case 'D':
                System.out.println("Yellow!");
                break;
            default: //모든 변수에 해당하지 않을 경우
                System.out.println("!!!!red!!");
                break;
        }


        System.out.println("\n\n");

        Calendar cal = Calendar.getInstance();  // 날짜 관련 클래스 
        
        cal.setTime(new Date()); // 현재 날짜 클래스에 적용
        int currDay = cal.get(Calendar.DAY_OF_WEEK); // 현 날짜 기준으로 일주일 중 요일을 가져옴. 1이 일요일

        System.out.println("변수의 currDay 값 " + currDay );


            switch(currDay){
                case 1 :
                    System.out.println("Today is 일요일");
                    break;
                case 2 :
                    System.out.println("Today is 월요일");
                    break;
                case 3 :
                    System.out.println("Today is 화요일");
                    break;
                case 4 :
                    System.out.println("Today is 수요일");
                    break;
                case 5 :
                    System.out.println("Today is 목요일");
                    break;
                case 6 :
                    System.out.println("Today is 금요일");
                    break;
                case 7 :
                    System.out.println("Today is 토요일");
                    break;






            }







    }
}


