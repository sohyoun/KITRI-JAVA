public class Lotto {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		do
		{
			num1 = (int)(Math.random()*3)+1;
			num2 = (int)(Math.random()*3)+1;
			num3 = (int)(Math.random()*3)+1;

		}
		while (num1 == num2 || num1 == num3 || num2 == num3);
		System.out.println("금주의 당첨번호 : "+num1+" "+num2+" "+num3);
	}
}
