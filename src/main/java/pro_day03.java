public class pro_day03 {
    public static void main(String[] args) {

        /*
            1. String.valueOf() : 파라미터의 값을 문자열(String)로 변환.
                                  파라미터로 가능한 타입 : Object, char[], boolean, char, int,long, float, double

            2. Integer.parseInt(String) : String 타입의 숫자를 int로 변환, 파라미터가 무조건 숫자로만 구성되어 있어야 함
                                          cf) byte, short, long, float, double 등의 숫자 타입으로 변환도 가능
                                          - Byte.parseByte();
                                          - Short.parseShort();

            3. Math.max(a, b) : 두 인자 값 중 큰 값을 리턴
                                cf) Math.min()
         */

        /// 예제 1 : 두 수의 연산값 비교하기
//        연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//        12 ⊕ 3 = 123
//        3 ⊕ 12 = 312
//        양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
//        단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.

        // 방법 1
        class Solution1 {
            public int solution(int a, int b) {
                int plusCase = Integer.parseInt((String.valueOf(a) + String.valueOf(b)));
                int multiplyCase = 2 * a * b;
                return plusCase > multiplyCase ? plusCase : multiplyCase;
            }
        }

        // 방법 2
        class Solution2 {
            public int solution(int a, int b) {
                return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),2*a*b);
            }
        }

        /// 예제 2 : 더 크게 합치기
//        연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//        12 ⊕ 3 = 123
//        3 ⊕ 12 = 312
//        양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//        단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.

        class Solution3 {
            public int solution(int a, int b) {

                int answer1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
                int answer2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));


                return answer1 < answer2 ? answer2 : answer1;
            }
        }





    }
}
