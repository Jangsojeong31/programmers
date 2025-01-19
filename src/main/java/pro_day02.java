import java.util.Arrays;
import java.util.Scanner;

public class pro_day02 {
    public static void main(String[] args) {

        //문자열 붙이기(1) concat() : 문자열을 추가할 때마다 새로운 인스턴스를 생성함. 성능이나 속도 면에서 좋지 않음
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String answer = a.concat(b);
        System.out.println(answer);

        //문자열 붙이기(2) + 연산자
        String str1 = "첫번째 텍스트입니다 ";
        String str2 = "두번째 텍스트입니다";
        System.out.println("결과: " + str1 + str2);

        //문자열 붙이기(3) StringBuilder (or StringBuffer)
        StringBuilder sb = new StringBuilder();
        sb.append("str1");
        sb.append("str2");
        String concat = sb.toString();


        //문자열 a에서 문자 하나씩 뽑는 방법 2  //방법 1은 pro_day01에 있음
        for (char ch : a.toCharArray())  //toCharArray() : String문자열을 char형 배열로 바꿔서 반환
            System.out.println(ch);

        //문자열 a에서 문자 하나씩 뽑는 방법 3
        for(String s : a.split("")) {  //split(String regex) : 입력받은 문자를 기준으로 문자열을 나누어 배열에 저장
            System.out.println(s);
        }

        //예시
        String str = "서울, 대전, 대구, 부산";
        String[] cityArr = str.split(",");

        for(int i = 0; i < cityArr.length; i++){
            System.out.println(cityArr[i]);
        }

        //printf("출력 서식", 출력할 내용)
        //지시자 : %d(정수 형식 출력), %b(boolean 형식으로 출력), %0(8진수 정수 형식), %c(문자형식), %f(소수점 형식)
        //%s(문자열 형식), %n(줄바꿈), %e(지수 표현식의 형식), %x(16진수 정수 형식)
        int n = sc.nextInt();
        String str02 = sc.nextLine();
        System.out.printf("%d is even",n);
        System.out.printf("내 나이는 %d살 입니다.%n",n);
        System.out.printf("내 나이는 %d살이며, %s에 살고 있습니다.", n, str02);


        //문자열 메소드
        //substring() : 원하는 문자열만큼 추출
        String str03 = "Hello";
        //substring(int beginIndex)
        System.out.println(str03.substring(3)); //lo
        //substring(int beginIndex, endIndex)
        str03.substring(1,3); //el
        System.out.println(str03.substring(1,3));

        //split(String regex) : 파라미터로 들어오는 문자열을 기준으로 문자열 쪼개서 배열로 저장, String[](배열) 리턴
        String str01 = "abcd#efg";
        String[] splited = str01.split("#"); // splited[0]: abcd, splited[1]: efg
        System.out.println(Arrays.toString(splited));

        String str04 = "aaa bbb ccc";
        String[] splited2 = str04.split(" "); // splited2[0]: aaa, splited2[1]: bbb, splited2[2]: ccc

    }

}
            //substring() 활용
        class Solution {

            public static String solution(String my_string, String overwrite_string, int s) {

                String a = my_string.substring(0,s);
                String b = overwrite_string;
                String c = my_string.substring((s + overwrite_string.length()));
                return a + b + c;
            }

            public static void main(String[] args) {

                String a = solution("HelloWorld", "rri", 2);
                System.out.println(a); //HerriWorld
            }
        }
