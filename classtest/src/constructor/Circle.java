package constructor;

/*
1. ������ : radius
2. ���� : calcArea()
   �ѷ� : calcRound()
*/
public class Circle {
	int radius;
	double area;
	double round;

	public Circle() {
		radius = 4;
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	void calcArea(){
		area = Math.pow(radius,2)*Math.PI;
	}

	double calcArea(int radius){
		area = Math.pow(radius,2)*Math.PI;
		return area;
	}

	void calcRound(){
		round = radius*2*Math.PI;
	}

	double calcRound(int radius){
		round = radius*2*Math.PI;
		return round;
	}
	
}
