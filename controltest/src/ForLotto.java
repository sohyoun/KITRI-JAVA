/*
** Lotto
1-3������ ����

*/
public class ForLotto {
	public static void main(String[] args) {
		int num1 = (int)(Math.random()*3+1);
		int num2 = 0;
		int num3 = 0;
		for (;;){			
			num2=(int)(Math.random()*3+1);
			if (num1!=num2){
				break;
			}
		}
		for (;;){		
			num3=(int)(Math.random()*3+1);
			if (num2!=num3 && num1!=num3){
				break;
			}
		}
		System.out.println("������ ��÷��ȣ : "+num1+" "+num2+" "+num3);
	}
}
