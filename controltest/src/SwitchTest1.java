public class SwitchTest1 {
	public static void main(String[] args) {
		int num = 1; //숫자 가능
		switch(num) {
			case 1 : System.out.println("1입니다.");break;
			case 2 : System.out.println("2입니다.");break;
			case 3 : System.out.println("3입니다.");break;
			default : System.out.println("123아닙니다.");
		}

		char c = 'a'; //아스키코드값 가진 char도 가능
		switch(c){
			case 97 : System.out.println("1입니다.");break;
			case 98 : System.out.println("2입니다.");break;
			case 99 : System.out.println("3입니다.");break;
			default : System.out.println("123아닙니다.");
		}

		String str = "java"; //버전6까지는 String값을 switch문에 쓸 수 없음. 
							 //jdk 7이상에서는 문자열 비교 가능
		switch(str){
			case "oracle" : System.out.println("oracle입니다.");break;
			case "java" : System.out.println("java입니다.");break;
			case "jsp" : System.out.println("jsp입니다.");break;
			default : System.out.println("전부 아닙니다.");
		}
		System.out.println("프로그램종료!!!");
	}
}
