/*
score(점수)가 
	90이상이면 학점은 A
	80이상이면 학점은 B
	70이상이면 학점은 C
	60이상이면 학점은 D
	60미만이면 학점은 F
X5이상이면 X+ 학점
결과 : 점수가 xx점이므로 X학점입니다.
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
		System.out.println("점수가 "+score+"점이므로 "+grade+"학점입니다.");
	}
}
