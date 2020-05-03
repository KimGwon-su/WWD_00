package db;

public class Solution19 {
	
	public String solution(String characters) {
		
		String result = "";
		
		result += characters.charAt(0);
		
		System.out.println("characters.legth = " + characters.length());
		
		for(int i = 1 ; i < characters.length() ; i++) {
			
			if(characters.charAt(i-1) != characters.charAt(i)) {
			
			result += characters.charAt(i);
			}
		}
			System.out.println("result = " + result);
			return result;
			
	}


	public static void main(String[] args) {
		Solution19 sol = new Solution19();
		String characters = "senteeeencccccceeee";
		String ret = sol.solution(characters);
		
		System.out.println(ret);
	}

}
