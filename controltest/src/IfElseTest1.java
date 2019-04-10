public class IfElseTest1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 100;
		/*
		if (x>y)
		{
			System.out.println(x + "는 " +  y + "보다 크다.");
		} else {
			System.out.println(x + "는 " +  y + "보다 작다.");
		}
		*/
		String ds;
		if (x == y)
		{
			ds = "같다.";
		} else{
			if (x>y)
			{
				ds = "크다";
			}else{
			ds = "작다.";
			}
		}
		//같다 비교 먼저 하는 것이 좋다.
		
		//남자 여자 if else로 바꾸기
		
		System.out.println(x + "는 " +  y + "보다 " + ds);
		System.out.println("프로그램 종료!!!");
	}
}
