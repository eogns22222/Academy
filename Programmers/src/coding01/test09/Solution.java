package coding01.test09;

// 수박수박수박수박수박수?
class Solution {
    public String solution(int n) {
        String answer = "";
        
        for (int i = 1; i <= n; i++) {
        	
			if(i % 2 == 1) {
				answer += "수";
			}else {
				answer += "박";
			}
		}
        
        return answer;
    }
}