/*
score(����)�� 
	90�̻��̸� ������ A
	80�̻��̸� ������ B
	70�̻��̸� ������ C
	60�̻��̸� ������ D
	60�̸��̸� ������ F
X5�̻��̸� X+ ����
��� : ������ xx���̹Ƿ� X�����Դϴ�.
*/

public class SwitchTest2 {
	public static void main(String[] args) {
		int score = 93;
		String grade;
		
		switch (score - score%10){
			case 100 : case 90 : grade = "A";break;
			case 80 : grade = "B";break;
			case 70 : grade = "C";break;
			case 60 : grade = "D";break;
			default : grade = "F";
		}
		int rest = score%10;
		if (score>60 && (rest>=5 || score==100) )
		{
			grade += "+";
		}
		System.out.println("������ "+score+"���̹Ƿ� "+grade+"�����Դϴ�.");
	}
}
