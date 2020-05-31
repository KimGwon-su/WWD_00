package db;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution409 {
 public int solution(int[][] height) {
     int count = 0;
     for(int i=0 ; i < height.length ; i++ ) {
    	 for(int j = 0 ; j < height[i].length ; j++) {	 
    		 int left = i-1;
    		 int right = i+1;
    		 int down = j+1;
    		 int up = j-1;
    		 
    		 boolean WarningZone = true;
    		 
    		 if(left > 0) {int leftV = height[left][j];
    		 
    			WarningZone = WarningZone&&(leftV > height[i][j]);
    			
    			
    		 }if(right < 4) {int rightV = height[right][j];
    		 
    		 	WarningZone = WarningZone&&(rightV > height[i][j]);
    		 	
    		 }if(down < 4) {int downV = height[i][down];
    		 
    		 	WarningZone = WarningZone&&(downV > height[i][j]);
    		 	
    		 }if(up > 0) {int upV = height[i][up];
    		 
    		 	WarningZone = WarningZone&&(upV > height[i][j]);
    		 	
    		 }if(WarningZone) {
    			 count++;
    		 }
    			 
    		
    	 }
    		 
    		 
    	 
     }
     return count;
 }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
     Solution409 sol = new Solution409();
     int[][] height = {{3, 6, 2, 8}, {7, 3, 4, 2}, {8, 6, 7, 3}, {5, 3, 2, 9}};
     int ret = sol.solution(height);

     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
 }
}