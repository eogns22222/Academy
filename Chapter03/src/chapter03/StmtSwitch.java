package chapter03;

public class StmtSwitch {

	public static void main(String[] args) {
		
		// 우리가 가지고 있는 음료수 : 콜라, 생수, 오렌지주스, 사이다, 에너지음료, 냉커피,식혜
		String item = "콜라";
		
		//jdk1.6 이하에서는 switch 문에 숫자 , 문자만 사용 가능하다.
		switch (item) {// 모든 구문은 코드블록시작부터 끝까지 읽게 되어있다.
		case "콜라": // case 문에서는 특정 casw 위치로 이동시켜 주지만 코드블럭 끝까지 가야만 한다.
			System.out.println(item+ "가 나왔습니다.");
			break;// 그래서 특정 케이스 실행 이후에 break 를 통해 해당 코드블록을 빠져나오는 것이다.
			
		case "생수":
			System.out.println(item+ "가 나왔습니다.");
			break;
			
		case "오렌지주스":
			System.out.println(item+ "가 나왔습니다.");
			break;
		
		default:
			System.out.println(item+" 은 보유하지 않고 있습니다.");
			break;
		}

	}

}
