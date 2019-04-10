public class IfElseIfTest1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 100;

		String dr;
		if (x==y)
		{
			dr = "같다";
		} else if (x>y)
		{
			dr = "크다";
		} else {
			dr = "작다";
		}
		
		/*
		ds = x == y ? "같다" : (x > y ? "크다" : "작다");
		*/ //삼항연산자로도 할 수 있지만 가독성이 떨어진다.

		System.out.println(x + "는 " + y + "보다 " + dr);
	}
}
