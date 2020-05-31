package db;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

public class Solution604 {
 public int solution(String[][] cards) {
     int answer = 0;
     int number = 0;
     int[] color = new int[3];
     
     for(int i = 0 ; i < cards.length ; i++) {
    	 number += Integer.parseInt(cards[i][1]);
    	 System.out.println(number);
    	 
    	 if(cards[i][0].equals("red")) {
    		 color[0]++;
    	 }else if(cards[i][0].equals("blue")){
    		 color[1]++;
    	 }else if(cards[i][0].equals("black")) {
    		 color[2]++;
    		
    	 }
     }  
     if(color[0] == 2 || color[1] == 2 || color[2] == 2) {
    	 answer = number * 2;
     }else if(color[0] == 3 || color[1] == 3 || color[2] == 3) {
    	 answer = number * 3;
     }else {
    	 answer = number;
     }System.out.println(Arrays.toString(color));
     return answer;
 }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
     Solution604 sol = new Solution604();
     String[][] cards1 = {{new String("blue"), new String("2")}, {new String("red"), new String("5")}, {new String("black"), new String("3")}};
     int ret1 = sol.solution(cards1);

     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

     String[][] cards2 = {{new String("blue"), new String("2")}, {new String("blue"), new String("5")}, {new String("black"), new String("3")}};
     int ret2 = sol.solution(cards2);

     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
     System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
 }
}