import java.util.Scanner;

public class pro_day01 {
    public static void main(String[] args) {

//        //1. 절대값
//        Math.abs(1-3);
//        System.out.println(Math.abs(1-3)); //2
//
//        //2. 문자열 반복
//        String str = "안녕";
//        System.out.println(str.repeat(3));

        //3. 대소문자 변환 : str.charAt(i) / Character.isUpperCase(char) / Character.toLowerCase(char)
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String answer = "";

        for(int i = 0; i < a.length(); i++){
            b = a.charAt(i);    //a에서 index가 i인 문자 하나 꺼내기
            if(Character.isUpperCase(b)){      //대문자인지 확인
                answer += Character.toLowerCase(b);     //소문자로 변환
            }else{
                answer += Character.toUpperCase(b);     //소문자면 대문자로 변환
            }
        }
        System.out.println(answer);

        //4.
        //배열 길이 : array.length
        //문자열 길이 : str.length()
    }


}
