import java.util.*;

public class AbstractTest1 {
	public static void main(String[] args) {
		//1.���� Ŭ���� ����
		//Calendar cal = new Calendar();//abstract���� ������ new�� ������.
		//���� ����Ŭ���� �ֳ� ������. GregorianCalendar ����.
		//Calendar cal = new GregorianCalendar();

		//2.�ڱ� ��ü�� retrun�ϴ� static method �̿�.
		Calendar cal = Calendar.getInstance();

		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DATE);
		int am = cal.get(Calendar.AM_PM);
		int h = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println(y+"�� "+m+"�� "+d+"�� "+am+h+"�� "+mi+"�� "+s+"��");
		//2���� ���. java�� �ε����� 0���� �����ϱ� ����.

	}
}
