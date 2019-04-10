public class Guest {
	static int cnt;//클래스당 하나만들어지는 Class변수 > 객체안만들어도 ( 클래스.)
	String name; //객체참조 instance 변수 객체 .

	public Guest(String name){
		this.name = name;
	}

	public int visit() {
		cnt++;
		return cnt;
	}
}
