public class Guest {
	static int cnt;//Ŭ������ �ϳ���������� Class���� > ��ü�ȸ��� ( Ŭ����.)
	String name; //��ü���� instance ���� ��ü .

	public Guest(String name){
		this.name = name;
	}

	public int visit() {
		cnt++;
		return cnt;
	}
}
