public class Circle extends Dohyung{
	int r;

	public Circle(int r){
		this.r = r;
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(r,2);
	}

	@Override
	public double getRound(){
		return (2*r*Math.PI);
	}
}
