public class AbstractTest2 {
	public static void main(String[] args) throws Exception{

		//3. 외부클래스 참조.
		//java.lang에 Process 들어가면 abstract class임으로 new 안됨.
		//하위 클래스 있나 봤더니 없음.
		//자신의 객체를 return하는 static method도 없음
		//외부 클래스 Runtime 들어가면 private이어서 하위 클래스 X, static method 인 2번 쓸 수 있음.
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("calc");
		System.out.println("");
	}
}
