package db;

public class Solution13 {
	public int func_a(int month, int day) {
		int monthList[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int total = 0;
		for(int i = 0 ; i<month-1 ; i++) {
			total = total + monthList[i];		

		}
		total = total + day;
		
		return total - 1;
	}
	
	public int solution(int startMonth, int startDay, int endMonth, int endDay) {
		int startTotal = func_a(startMonth, startDay);
		
		int endTotal = func_a(endMonth, endDay);
		
		return endTotal - startTotal;
	}

	public static void main(String[] args) {
	Solution13 sol = new Solution13();
	
		int ret = sol.solution(1,  2,  2,  2);
		
		System.out.println("solution : " + ret);

	}

}
