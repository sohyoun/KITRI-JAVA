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
/*
public class IfElseIfTest2 {
	public static void main(String[] args) {
		
		int score = 58;
		String grade;
		
		if (score>=90){
			if (score>=95){
				grade ="A+";
			}else {
				grade ="A";
			}
		} else if (score>=80){
			if (score>=85){
				grade ="B+";
			}else {
				grade ="B";
			}
		} else if (score>=70){
			if (score>=75){
				grade ="C+";
			}else {
				grade ="C";
			}
		} else if (score>=60){
			if (score>=65){
				grade ="D+";
			}else {
				grade ="D";
			}
		} else {
			grade="F";
		}
		System.out.println("������ "+score+"�� �̹Ƿ� "+grade+"�����Դϴ�.");
	}
}
*/
/*
public class IfElseIfTest2 {
	public static void main(String[] args) {
		
		int score = 90;
		String grade;
		
		if (score>=90){
			grade= score>=95 ? "A+":"A";
		} else if (score>=80){
			grade= score>=85 ? "B+":"B";
		} else if (score>=70){
			grade= score>=75 ? "C+":"C";
		} else if (score>=60){
			grade= score>=65 ? "D+":"D";
		} else {
			grade="F";
		}
			
		
		System.out.println("������ "+score+"�� �̹Ƿ� "+grade+"�����Դϴ�.");
	}
}
*/
public class IfElseIfTest2 {
	public static void main(String[] args) {
		
		int score = 65;
		String grade;
		int rest = score%10;
		
		if (score>=90){
			grade = "A";
		} else if (score>=80){
			grade= "B";
		} else if (score>=70){
			grade= "C";
		} else if (score>=60){
			grade= "D";
		} else {
			grade="F";
		}
		if (score >60 && (score == 100 || rest>=5))
		{
			grade += "+";
		}
		
		System.out.println("������ "+score+"�� �̹Ƿ� "+grade+"�����Դϴ�.");
	}
}
