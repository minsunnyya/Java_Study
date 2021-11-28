package CodingTest;


class Solution01 {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution01 s = new Solution01();
        System.out.println(s.solution(2));
    }
}


/*풀이 방법
if-else 구문 사용해서 품
나머지가 짝수일때 Even나오게
홀수일때 Odd나오게 코드 짬
 */