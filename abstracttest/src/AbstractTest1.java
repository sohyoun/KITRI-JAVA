import java.util.*;

public class AbstractTest1 {
	public static void main(String[] args) {
		//1.하위 클래스 참조
		//Calendar cal = new Calendar();//abstract여서 생성자 new로 못만듦.
		//따라서 하위클래스 있나 봐야함. GregorianCalendar 있음.
		//Calendar cal = new GregorianCalendar();

		//2.자기 객체를 retrun하는 static method 이용.
		Calendar cal = Calendar.getInstance();

		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DATE);
		int am = cal.get(Calendar.AM_PM);
		int h = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println(y+"년 "+m+"월 "+d+"일 "+am+h+"시 "+mi+"분 "+s+"초");
		//2월로 뜬다. java의 인덱스는 0부터 시작하기 때문.

	}
}
