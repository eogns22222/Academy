package ch09.ex02;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		long result;
		
		result = sol.solution("onetwothreefourfivesixseveneightnine");
		System.out.println("123456789==" + result);
		
		result = sol.solution("onefourzerosixseven");
		System.out.println("14067==" + result);
		
	}

}
