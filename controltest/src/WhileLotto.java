public class WhileLotto {
	public static void main(String[] args) {
		System.out.println("");
		int num1 = (int)(Math.random()*3+1);
		int num2 = (int)(Math.random()*3+1);
		int num3 = (int)(Math.random()*3+1);
		while (num1 == num2 || num1 == num3 || num2 == num3)
		{	
			num1 = (int)(Math.random()*3+1);
			num2 = (int)(Math.random()*3+1);
			num3 = (int)(Math.random()*3+1);
			
		}//while�� �ߺ��� �ڵ尡 �����.
		System.out.println("������ ��÷��ȣ : "+num1+" "+num2+" "+num3);
		
	}
}
