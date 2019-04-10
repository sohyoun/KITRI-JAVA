package constructor;

/*
1. 가로 : width , 세로 : height
2. 넓이 : calcArea()
   둘레 : calcRound()
*/
public class Rect {
	int width;
	int height;
	double area;
	double round;

	public Rect() {
		width = 4;
		height = 3;
	}

	public Rect(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	void calcArea(){
		area = width*height;
	}

	double calcArea(int width,int height){
		area = width*height;
		return area;
	}

	void calcRound(){
		round = (width+height)*2;
	}

	double calcRound(int width,int height){
		round = (width+height)*2;
		return round;
	}

}
