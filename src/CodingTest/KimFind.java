package CodingTest;

class Kim_Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Kim_Solution kf = new Kim_Solution();
        String arr[] = new String[]{"JANE","KIM"};
        System.out.println(kf.solution(arr));
    }
}