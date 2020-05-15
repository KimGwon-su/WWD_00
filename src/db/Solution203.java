package db;

//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

public class Solution203 {
 public int solution(int N, int M) {
	 int answer = 0;
     for(int i =N ; i<=M ; i++ ) {
    	 if(i%2==0) {
    		 answer += i*i;
    		
    	 }
     }return answer;
 }

 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
 public static void main(String[] args) {
     Solution203 sol = new Solution203();
     int N = 10;
     int M = 15;
     int ret = sol.solution(N, M);

     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.  
     System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
 	}
}