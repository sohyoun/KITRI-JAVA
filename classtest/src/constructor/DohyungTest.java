package constructor;

public class DohyungTest {
	public static void main(String[] args) {
		Rect r1=new Rect(); 
		//default 
		//가로가4이고 세로가3인 사각형의 넓이는 12이고 둘레는 14입니다.
		r1.calcArea();
		r1.calcRound();
		System.out.println("가로가 "+r1.width+"이고 세로가 "+r1.height+"인 사각형의 넓이는 "+r1.area+"이고 둘레는 "+r1.round+"입니다.");
		
		int width = 5;
		int height = 3;
		Rect r2=new Rect(width,height);
		//맘대로 가로,세로 정함
		r2.calcArea(width,height);
		r2.calcRound(width,height);
		System.out.println("가로가 "+r2.width+"이고 세로가 "+r2.height+"인 사각형의 넓이는 "+r2.area+"이고 둘레는 "+r2.round+"입니다.");
		

		Circle c1=new Circle();
		//default
		//반지름이 4인 원의 넓이는 48.xxx이고 둘레는 24.xxx입니다.
		c1.calcArea();
		c1.calcRound();
		System.out.println("반지름이 "+c1.radius+"인 원의 넓이는 "+c1.area+"이고 둘레는 "+c1.round+"입니다.");

		int radius = 5;
		Circle c2=new Circle(radius);
		//맘대로 반지름 정함
		c2.calcArea(radius);
		c2.calcRound(radius);
		System.out.println("반지름이 "+c2.radius+"인 원의 넓이는 "+c2.area+"이고 둘레는 "+c2.round+"입니다.");


	}
}
