public class DohyungTest {
	public static void main(String[] args) {
		Rect r1 = new Rect(4,5);

		System.out.println("가로가 "+r1.width+", 세로가 "+r1.height+"인 사각형의 넓이는 "
			+r1.getArea()+"이고 둘레는 "+r1.getRound()+" 입니다.");

		Circle c1 = new Circle(4);

		System.out.println("반지름이 "+c1.r+"인 원의 넓이는 "+c1.getArea()+
			"이고 둘레는"+c1.getRound()+"입니다.");

		//Dohyung d = new Dohyung(); >> 에러남.

		/*
		Dohyung d1 = new Rect(4,3);//Rect 처음에 super 생략 >Dohyung 만들어짐, Dohyung super> Object 만들어짐
								   //d는 실제 Dohyung을 뜻함.
		System.out.println("가로가 "+d1.width+", 세로가 "+d1.height+"인 사각형의 넓이는 "
			+d1.getArea()+"이고 둘레는 "+d1.getRound()+" 입니다.");
			//>>에러남. why? Dohyung에는 width,height가 없기 때문
			//getArea와 getRound는 에러X why? Rect class와 getArea,getRound에 연결되어있기 때문
		*/

		Dohyung d1 = new Rect(4,3);
		System.out.println("도형의 넓이는"+d1.getArea()+"이고 둘레는 "+d1.getRound()+" 입니다.");
		//> 따라서 width,height는 구할 수 없지만 getArea와 getRound는 구할수 잇다.

		//Rect r2 = d1;//에러남. 상위 클래스 dohyung을 하위클래스 Rect에 집어넣을 수 없음.
						//모든 도형은 사각형이 아니기 때문

		Rect r2 = (Rect) d1; //따라서 바꿔줘야 한다.
		System.out.println("가로가 "+r2.width+", 세로가 "+r2.height+"인 사각형의 넓이는 "
			+r2.getArea()+"이고 둘레는 "+r2.getRound()+" 입니다.");

		//Circle c2 = (Circle)d1; //컴파일 상으론 에러 X
		//>>하지만 실행해보면 에러. d1에는 Object,Dohyung,Rect만 있지 Circle은 없어서 주소값을 참조할 수 없다.
		//>>Class cast Exception : Class를 형변환 할 수 없다.


		
	}
}
