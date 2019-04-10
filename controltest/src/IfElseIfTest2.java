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
		System.out.println("점수가 "+score+"점 이므로 "+grade+"학점입니다.");
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
			
		
		System.out.println("점수가 "+score+"점 이므로 "+grade+"학점입니다.");
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
		
		System.out.println("점수가 "+score+"점 이므로 "+grade+"학점입니다.");
	}
}
