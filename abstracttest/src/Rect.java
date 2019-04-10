public class Rect extends Dohyung{ //사각형은 도형임으로 상속받음.
								   //도형은 추상class임으로 반드시 override해야함.
	int width;
	int height;

	public Rect(int width, int height) {
		this.width=width;
		this.height = height;
	}
	
	
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getRound() { // 강제성 부여. getRound 이름이 틀리면 에러남. 상위 class Dohyung의 method와 이름 같아야함.
		return (width + height)*2;
	}
	
}
