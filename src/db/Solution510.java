package db;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution510 {
 public int solution(int[] timeTable, int n) {
     int answer = 0;
     int number = 0;
     int max = 0;
     int[] current = new int [n+1];
     for(int i = 0 ; i < n ; i++) {
    	 for(int j = i ; j <timeTable.length ; j = j+n ) {
    		 current[i] += timeTable[j];
    		 
    		 if(current[i]>max) {
    			 max = current[i];
    		 }
    	 }
    	 answer = max;
     }
     return answer;
 }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
 	Solution510 sol = new Solution510();
 	int[] timeTable1 = {1, 5, 1, 9};
 	int n1 = 3;
 	int ret1 = sol.solution(timeTable1, n1);

 	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
 	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

 	int[] timeTable2 = {4, 8, 2, 5, 4, 6, 7};
 	int n2 = 4;
 	int ret2 = sol.solution(timeTable2, n2);

 	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
 	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
 }
}
