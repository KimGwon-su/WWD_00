package db;

class Solution610 {
    public int solution(int weight, int[] boxes) {
        int answer = 0;

        for(int i = 0; i < boxes.length; i++) 
        	if(boxes[i]*0.9 > weight || boxes[i]*1.1 < weight)
        		answer++;
        	
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution610 sol = new Solution610();
        int weight = 600;
        int[] boxes = {653, 670, 533, 640, 660};
        int ret = sol.solution(weight, boxes);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}