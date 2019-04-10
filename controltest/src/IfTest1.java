public class IfTest1 {
	public static void main(String[] args) {
		int x =10;
		int y = 7;
		if (x>y) {
			System.out.println("x가 크다");
		}
		System. out.println("프로그램 종료!!!");
		
		int jumin =2;
		/*
		if (jumin>0)
		{
			if (jumin%2 == 0){
			System. out.println("당신은 여자입니다.");
			}
			if (jumin%2 != 0)
			{
			System.out.println("당신은 남자입니다.");
			}

		}
		*/ //A아니면 B일때 if를 두개 쓰는 것은 좋지 않다.

		//따라서 아래처럼 변수를 만들어 하는 것이 적합하다.
		String gender ="남자";
		if (jumin %2 ==0)
		{
			gender = "여자";
		}
		System.out.println(gender);
		
	}
}
