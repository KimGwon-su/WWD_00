package db;

class Solution207 {
    public int solution(int value, String unit) {
        int converted = 0;
        if (unit.equals("C"))
            converted = (int)(value * 1.8 + 32);
        System.out.println("converted==>>" + converted);
        if (unit.equals("F"))
            converted = (int)((value - 32) / 1.8);
        return converted;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution207 sol = new Solution207();
        int value = 527 ;
        String unit = "F";
        int ret = sol.solution(value, unit);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}