public class Circle implements DohyungArea{
	int r;

	public Circle(int r){
		this.r = r;
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(r,2);
	}

	
}
